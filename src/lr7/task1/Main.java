package lr7.task1;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("один аргумент в суперкласс");
        System.out.println(superClass+"\n");

        SubClass subClass = new SubClass("один аргумент в подкласс");
        System.out.println(subClass+"\n");

        SubClass subClass1 = new SubClass("один аргумент в подкласс","второй аргумент в подкласс");
        String subClassTest = subClass1.toString();
        System.out.println(subClassTest+"\n");


    }
}
