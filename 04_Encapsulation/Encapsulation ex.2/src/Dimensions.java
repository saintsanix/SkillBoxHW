public class Dimensions {
    private final double widht;
    private final double height;
    private final double lenght;

    public Dimensions(double widht, double height, double lenght) {
        this.widht = widht;
        this.height = height;
        this.lenght = lenght;
    }

    public double dimensionsCalc() {
        return widht * height * lenght;
    }
}
