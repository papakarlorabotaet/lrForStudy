package lr9.examples1_14;

public class Example12 {
    public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("������ ������� �������");
        }
        if (chislo > 0.001) {
            throw new IllegalArgumentException("�������� �����");
        }
    }

    public static void main(String[] args) {
        m(null, 0.000001);
    }
}
