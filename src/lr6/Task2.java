package lr6;

public class Task2 {
    public static void main(String[] args) {
        Example example = new Example();
        example.printAndIncrease();
        example.printAndIncrease();
        example.printAndIncrease();
        example.printAndIncrease(); //3
    }
}
class Example{
    private static int num = 0;
    void printAndIncrease(){
        System.out.println(num);
        num++;
    }
}
