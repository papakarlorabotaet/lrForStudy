package lr1;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = scan.nextInt();

        System.out.println("Enter second number: ");
        int secondNum = scan.nextInt();

        int sum = firstNum + secondNum;
        int diff = firstNum - secondNum;

        System.out.printf("Sum = %d\nDifference = %d",sum,diff);
    }
}
