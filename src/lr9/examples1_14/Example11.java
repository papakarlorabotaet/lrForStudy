package lr9.examples1_14;

public class Example11 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("������");
        } catch (NullPointerException e) {
            System.out.println("1");
        } finally {
            System.out.println("2");
        }
        System.out.println("3");
    }
}
