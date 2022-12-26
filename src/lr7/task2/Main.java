package lr7.task2;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        System.out.println(superClass);

        SuperClass superClass2 = new SuperClass("AnotherText");
        System.out.println(superClass2);

        BasicClass basicClass = new BasicClass("AnywayText");
        System.out.println(basicClass);

        BasicClass basicClass2 = new BasicClass("NotAnywayText",3);
        System.out.println(basicClass2);

        BasicClass basicClass3 = new BasicClass(2);
        System.out.println(basicClass3);

    }
}
