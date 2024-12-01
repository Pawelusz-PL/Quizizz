import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PointsLogic points = new PointsLogic(0);
        Scanner scanner = new Scanner(System.in);




        System.out.println("          QUIZ APP        ");
        System.out.println(" ");
        System.out.println("· Application Developer: Pawelusz");
        System.out.println("· Application Version: 1.0 Beta");
        System.out.println(" ");
        System.out.println("Wpisz START, aby rozpocząć grę");

        while (true) {
            String start = scanner.nextLine();
            if (!"start".equalsIgnoreCase(start)) {
                System.err.println("Błąd: Wpisano niepoprawny parametr\nWpisz ponownie");
            } else {
                System.out.println("Sukces!\n ");

                checkAnswer("Czy uważasz, że ogórki powinny mieć własne paszporty?",
                        "Tak", "Tak/Nie", scanner, points);

                checkAnswer("Jakie zwierzę jest dla Pawelusza najlepsze?\n" +
                                "a) Koty\nb) Psy\nc) Delfiny\nd) Pingwiny",
                        "Pingwiny", "ABCD", scanner, points);

                checkAnswer("Czy delfiny umieją pływać w powietrzu?",
                        "Nie", "Tak/Nie", scanner, points);

                checkAnswer("Czy w Indiach można znaleźć pingwiny?",
                        "Nie", "Tak/Nie", scanner, points);

                System.out.println("Twój wynik końcowy: " + points.getPoints());
                scanner.close();
                break;
            }
        }
    }
    public static String checkAnswer(String question, String correctAnswer, String type, Scanner scanner, PointsLogic pointsLogic) {
        System.out.println(" ");
        System.out.println(question);
        System.out.println("Typ Pytania: " + type);
        System.out.println(" ");

        String userAnswer = scanner.nextLine();

        if (correctAnswer.equalsIgnoreCase(userAnswer)) {
            System.out.println("Poprawna odpowiedź!");
            pointsLogic.addPoints(10);

        } else
            System.out.println("Źle! Poprawna odpowiedź to: " + correctAnswer);
            pointsLogic.subtractPoints(10);

            // If points are less than 0, set them to 0
        if (pointsLogic.getPoints() < 0)
            pointsLogic.setPoints(0);

        System.out.println("Aktualny status punktów: " + pointsLogic.getPoints());
        return userAnswer;
    }
}

