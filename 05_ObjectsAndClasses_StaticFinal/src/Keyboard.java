public class Keyboard {
    private final String type;
    private final boolean backlighting;
    private final double weight;

    public Keyboard(String type, boolean backlighting, double weight) {
        this.type = type;
        this.backlighting = backlighting;
        this.weight = weight;
    }

    public Keyboard setType(String type) {
        return new Keyboard(type, backlighting, weight);
    }

    public Keyboard setBacklighting(boolean backlighting) {
        return new Keyboard(type, backlighting, weight);
    }

    public Keyboard setWeight(double weight) {
        return new Keyboard(type, backlighting, weight);
    }

    public String getType() {
        return type;
    }

    public boolean getBacklighting() {
        return backlighting;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "Тип " + getType() + " подсветка " + getBacklighting() + " вес " + getWeight() + " г.";
    }
}
