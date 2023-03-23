public class Main {
    public static void main(String[] args) {
        int volume = 1200;

        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute

        int volumePoolNow = 0;
        int times = 0;

        while (volumePoolNow < volume) {
            volumePoolNow = volumePoolNow + fillingSpeed - devastationSpeed;
            times++;
        }
        System.out.println("Бассейн наполнится за " + times + " минут");
    }
}
