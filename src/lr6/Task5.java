package lr6;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Расчет без рекурсии для числа 6: ");
        square.make(6);
        System.out.print("Расчет без рекурсии для числа 8: ");
        square.make(8);
        squareRecursion.Counting(6);
        squareRecursion.output1();
        squareRecursion.zeroFinal();
        squareRecursion.Counting(8);
        squareRecursion.output2();
        squareRecursion.zeroFinal();
    }


    static class square {
        static void make(int num) {
            int count = 0;
            while (num > 0) {
                count += num * num;
                num--;
            }
            System.out.println(count);
        }
    }



    static class squareRecursion {
        static int count = 0;

        static void Counting(int num) {
            if (num > 0) {
                count += num * num;
                Counting(num - 1);
            }
        }

        static void output1() {
            System.out.println("Решение с рекурсией для числа 5: " + count);
        }

        static void output2() {
            System.out.println("Решение с рекурсией для числа 10: " + count);
        }

        static void zeroFinal() {
            count = 0;
        }
    }
}
