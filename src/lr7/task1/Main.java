package lr7.task1;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("���� �������� � ����������");
        System.out.println(superClass+"\n");

        SubClass subClass = new SubClass("���� �������� � ��������");
        System.out.println(subClass+"\n");

        SubClass subClass1 = new SubClass("���� �������� � ��������","������ �������� � ��������");
        String subClassTest = subClass1.toString();
        System.out.println(subClassTest+"\n");


    }
}
