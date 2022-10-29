package lr3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the total number of numbers for the result sum - ");
        int amountNumber = scan.nextInt();
        scan.close();

        
        int[] numbers = rightNumbers(amountNumber);

        findSumWithFor(numbers);
        findSumWithWhile(numbers, amountNumber);

    }
    public static int[] rightNumbers(int total) {
        int i = 1;
        int j = 0;
        int[] desiredNumbers = new int[total];

        while(total > 0) {
            if(i % 5 == 2 || i % 3 == 1) {
                System.out.printf("%d ", i);
                desiredNumbers[j] = i;
                j++;
                i++;
                total--;
            }
            i++;
        }
        return desiredNumbers;
    }


    public static void findSumWithFor(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) sum += numbers[i];
        System.out.printf("%nСумма чисел (с помощью цикла for): %d", sum);
    }

    public static void findSumWithWhile(int[] numbers, int total) {
        int sumNums = 0;
        while (total > 0) sumNums += numbers[(--total)];
        System.out.printf("%nСумма чисел (с помощью цикла while): %d", sumNums);
    }
}
