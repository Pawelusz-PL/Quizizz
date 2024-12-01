public class PointsLogic {
    private int points;

    public PointsLogic(int initialPoints) {
        this.points = initialPoints;
    }

    public void addPoints(int value) {
        this.points += value;
    }

    public void subtractPoints(int value) {
        this.points -= value;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
