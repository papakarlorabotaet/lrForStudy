package lr9.exercises1_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("¬ведите количество элементов в массиве: ");
        try {
            int line  = scan.nextInt();
            byte[] arr = new byte[line ];
            for (int a = 0; a < arr.length; a++) {
                System.out.println("¬ведите значени€ типа byte дл€ заполнени€ массива " +count+": ");
                arr[a] = scan.nextByte();
            }
            for (byte b : arr) {
                System.out.print(b +", ");
            }
        } catch (InputMismatchException e) {
            System.out.println("¬ведено некоректное значение!" + "(" + e + ")");
        }
    }
}
