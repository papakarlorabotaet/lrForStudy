package lr6;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Без рекурсии 5!!: ");
        Factorial.DoubleFactorial(5);
        System.out.print("Без рекурсии 10!!: ");
        Factorial.DoubleFactorial(10);
        System.out.print("С рекурсией 5!!: ");
        Factorial2.DoubleFacctorial2(5);
        Factorial2.output();
        Factorial2.one();
        System.out.print("С рекурсией 10!!: ");
        Factorial2.DoubleFacctorial2(10);
        Factorial2.output();
        Factorial2.one();
    }


    static class Factorial {
        static void DoubleFactorial(int num) {
            int count = 1;
            while (num > 0) {
                if (num > 2) {
                    count = count * num;
                } else if (num == 2) {
                    count = count * 2;
                } else if (num == 1) {
                    count = count * 1;
                }
                num = -2;
            }
            System.out.println(count);
        }
    }

    static class Factorial2 {
        static int count = 1;

        static void DoubleFacctorial2(int num) {
            count *= num;
            if (num - 2 > 2) {
                DoubleFacctorial2(num - 2);
            } else if (num - 2 == 2) {
                count *= 2;
            } else if (num - 2 == 1) {
                count *= 1;
            }
        }

        static void output() {
            System.out.println(count);
        }

        static void one() {
            count = 1;
        }
    }
}
