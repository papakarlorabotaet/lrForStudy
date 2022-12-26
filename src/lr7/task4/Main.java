package lr7.task4;



public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        System.out.println(superClass);

        SubClasss subClasss = new SubClasss('z',"texttext");
        System.out.println(subClasss);

        SubSubClasss subSubClasss = new SubSubClasss('z',"texttext",11);
        System.out.println(subSubClasss);
    }
}
