public class Main {
    public static void main(String[] args) {
        Cargo a = new Cargo(new Dimensions(5,4,3),50,
                "�����", true, "fdfd", true);
        Cargo b = a.setAddress("������");
        b = a.setDimensions(new Dimensions(90, 1,1));

        System.out.println(b);
        System.out.println(a);
    }
}
