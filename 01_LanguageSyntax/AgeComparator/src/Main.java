public class Main {
    public static void main(String[] args) {

        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1; // ����������� �������
        int middle = -1; // ������� �������
        int max = -1; // ������������ �������

        if (vasyaAge < mishaAge) {
            min = vasyaAge;
            max = mishaAge;
        } else {
            min = mishaAge;
            max = vasyaAge;
        }
        if (min > katyaAge) {
            middle = min;
            min = katyaAge;

        } else  if (katyaAge > max) {
            middle = max;
            max = katyaAge;
        } else middle = katyaAge;

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }
}
