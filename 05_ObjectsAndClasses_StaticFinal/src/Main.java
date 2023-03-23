public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("HyperX", "GamingPC");
        computer.setCPU(new CPU(3.5, 8, "Intel", 30));
        computer.setRAM(new RAM("DDR4", 16, 20));
        computer.setDATA(new DATA("WD", 512, 315));
        computer.setScreen(new Screen(19, "IPS", 2698));
        computer.setKeyboard(new Keyboard("KG101", true, 150));

        System.out.println(computer.toString());

        Computer computer1 = new Computer("Apple", "\nWorkPC");
        computer1.setCPU(new CPU(2.4, 8, "Apple", 30));
        computer1.setRAM(new RAM("Apple", 8, 20));
        computer1.setDATA(new DATA("Apple", 512, 300));
        computer1.setScreen(new Screen(16, "IPS", 1500));
        computer1.setKeyboard(new Keyboard("Magic", false, 220));

        System.out.println(computer1.toString());
    }
}