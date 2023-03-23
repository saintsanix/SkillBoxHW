public class Arithmetic {
    private int a;
    private int b;
    private int sum;
    private int multiply;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
        sum = a + b;
        multiply = a * b;
    }

    public int calcSum() {
        return sum;
    }

    public int calcMultiply() {
        return multiply;
    }

    public int maxMin() {
        return a >= b ? a : b;
    }
}
