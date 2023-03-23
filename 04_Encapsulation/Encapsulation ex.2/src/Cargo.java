public class Cargo {
    private final Dimensions dimensions;
    private final double mass;
    private final String address;
    private final boolean mayFlip;
    private final String regNumber;
    private final boolean isFragile;

    public double getDimensions() {
        return dimensions.dimensionsCalc();
    }

    public double getMass() {
        return mass;
    }

    public String getAddress() {
        return address;
    }

    public boolean isMayFlip() {
        return mayFlip;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean getIsFragile() {
        return isFragile;
    }

    public Cargo setMass(double mass) {
        return new Cargo(dimensions, mass, address, mayFlip, regNumber, isFragile);
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions, mass, address, mayFlip, regNumber, isFragile);
    }
    public Cargo setMayFlip(boolean mayFlip) {
        return new Cargo(dimensions, mass, address, mayFlip, regNumber, isFragile);
    }

    public Cargo setRegNumber(String regNumber) {
        return new Cargo(dimensions, mass, address, mayFlip, regNumber, isFragile);
    }

    public Cargo setIsFragile(boolean isFragile) {
        return new Cargo(dimensions, mass, address, mayFlip, regNumber, isFragile);
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, mass, address, mayFlip, regNumber, isFragile);
    }

    public Cargo(Dimensions dimensions, double mass, String address, boolean mayFlip, String regNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.mass = mass;
        this.address = address;
        this.mayFlip = mayFlip;
        this.regNumber = regNumber;
        this.isFragile = isFragile;
    }

    public String toString() {
        return "Данные о заказе: \n" +
                "Габариты: " + getDimensions() + "\n" +
                "Масса: " + getMass() + "\n" +
                "Адрес: " + getAddress() + "\n" +
                "Можно переворачивать: " + isMayFlip() + "\n" +
                "Рег. номер: " + getRegNumber() + "\n" +
                "Хрупкий: " + getIsFragile() + "\n";
    }
}
