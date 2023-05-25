package lr7.task5;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("textForSuperClass");
        System.out.println(superClass);

        SubClass subClass = new SubClass("textForFirstSubClass",17);
        System.out.println(subClass);

        SubClass2 subClass2 = new SubClass2("textForSecondSubClass",'q');
        System.out.println(subClass2);
    }
}
