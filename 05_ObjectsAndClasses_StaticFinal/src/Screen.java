public class Screen {
    public final double diagonal;
    private final String type;
    private final double weight;

    public Screen(double diagonal, String type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public Screen setDiagonal(double diagonal) {
        return new Screen(diagonal, type, weight);
    }

    public Screen setType(String type) {
        return new Screen(diagonal, type, weight);
    }

    public Screen setWeight(double weight) {
        return new Screen(diagonal, type, weight);
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "Диагональ " + getDiagonal() + " тип " + getType() + ", вес " + getWeight() + " г.";
    }
}
