public class Computer {
    private final String vendor;
    private final String name;
    private double totalWeight;
    private CPU cpu;
    private RAM ram;
    private DATA data;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public Computer setVendor(String vendor) {
        return new Computer(vendor, name);
    }

    public Computer setName(String name) {
        return new Computer(vendor, name);
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public void setCPU(CPU cpu){
        this.cpu = cpu;
    }

    public void setRAM(RAM ram) {
        this.ram = ram;
    }

    public void setDATA(DATA data) {
        this.data = data;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double getTotalWeight() {
        return totalWeight = totalWeight + cpu.getWeight() + ram.getWeight() +
                data.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    public String toString() {
        return name + "\nПроизводитель: " + vendor + "\nПроцессор: " + cpu.toString() +
                "\nОперативная память: " + ram.toString() + "\nЖесткий диск: " + data.toString() +
                "\nЭкран: " + screen.toString() + "\nКлавиатура: " + keyboard.toString() +
                "\nОбщий вес: " + getTotalWeight();
    }
}


