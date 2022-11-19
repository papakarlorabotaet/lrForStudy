package lr5;
import java.util.Scanner;



public class Task3 {
    public static void main(String[] args) {
        int args1 = 1;
        int args2 = 2;


        TestClass without = new TestClass();
        TestClass withOne = new TestClass(args1);
        TestClass withTwo = new TestClass(args1, args2);
    }
    static class TestClass {
        private int num1, num2;
        TestClass() {
            System.out.print("with 0 args: sum = 0\n\n");
        }
        TestClass(int n1) {
            System.out.print("with 1 args: sum = " + summaryFirst(n1) + "\n\n");
        }
        TestClass(int n1, int n2) {
            System.out.print("with 2 args: sum = " +  summarySecond(n1,n2) + "\n\n");
        }
        private int summaryFirst (int n1) {
            return n1;
        }
        private int summarySecond(int n1, int n2) {
            return n1 + n2;
        }
    }
}
