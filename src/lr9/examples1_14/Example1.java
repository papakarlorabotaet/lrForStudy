package lr9.examples1_14;

public class Example1 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("������������� ������");
        } catch (RuntimeException e) {
            System.out.println("1  " + e);
        }
        System.out.println("2");
    }
}

