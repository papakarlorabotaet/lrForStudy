package lr9.examples1_14;

public class Example2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Не проверяемая ошибка");
        } catch (Exception e) {
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }
}

