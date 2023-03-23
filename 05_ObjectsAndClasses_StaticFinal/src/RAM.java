public class RAM {
    private final String type;
    private final int amount;
    public final double weight ;

    public RAM(String type, int amount, double weight) {
        this.type = type;
        this.amount = amount;
        this.weight = weight;
    }

    public RAM setType(String type) {
        return new RAM(type, amount, weight);
    }

    public RAM setAmount(int amount) {
        return new RAM(type, amount, weight);
    }

    public RAM setWeight(double weight) {
        return new RAM(type, amount, weight);
    }

    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "Тип " + getType() + " объём " + getAmount() + " Гб, вес " + getWeight() + " г.";
    }
}
