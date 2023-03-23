public class CPU {
    public final double frequency;
    public final int cores;
    public final String manufacturer;
    public final double weight;

    public CPU(double frequency, int cores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public CPU setFrequency(double frequency) {
        return new CPU(frequency, cores, manufacturer, weight);
    }

    public CPU setCores(int cores) {
        return new CPU(frequency, cores, manufacturer, weight);
    }

    public CPU setManufacturer(String manufacturer) {
        return new CPU(frequency, cores, manufacturer, weight);
    }

    public CPU setWeight(double weight) {
        return new CPU(frequency, cores, manufacturer, weight);
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "„астота " + getFrequency() + " √√ц, " + getCores() +
                " €дер, производитель " + getManufacturer() + ", вес " + getWeight() + " г.";
    }
}
