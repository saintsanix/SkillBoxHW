public class DATA {
    private final String type;
    private final int amount;
    private final double weight;

    public DATA(String type, int amount, double weight) {
        this.type = type;
        this.amount = amount;
        this.weight = weight;
    }

    public DATA setType(String type) {
        return new DATA(type, amount, weight);
    }

    public DATA setAmount(int amount) {
        return new DATA(type, amount, weight);
    }

    public DATA setWeight(double weight) {
        return new DATA(type, amount, weight);
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
        return "Òθο  " + getType() + " ξαϊεμ " + getAmount() + " Γα, βερ " + getWeight() + " γ.";
    }
}
