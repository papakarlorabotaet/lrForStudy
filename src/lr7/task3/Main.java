package lr7.task3;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(1);
        System.out.print(superClass);

        SubClass subClass = new SubClass(2,'a');
        System.out.print(subClass);

        SubSubClass subSubClass = new SubSubClass(3,'b',"text");
        System.out.println(subSubClass);
    }
}

