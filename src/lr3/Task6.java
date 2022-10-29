package lr3;

import java.util.Scanner;


public class Task6 {
    public static void main(String[] args) {


        rightNumbers(scanUserNumber());



    }

    public static int scanUserNumber(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Enter the total number of numbers for the result sum - ");
            if (scan.hasNextInt()){
                int value = scan.nextInt();
                if(value > 0){
                    return value;
                }
                System.out.println("Error, please try again");

            }

        }
    }

    public static int[] rightNumbers(int totalLimit) {
        int i = 1;
        int j = 0;
        int[] targetNums = new int[totalLimit];


        while(totalLimit > 0) {
            if(i % 5 == 2) {
                System.out.printf("%d ", i);
                targetNums[j] = i;
                j++;
                i++;
                totalLimit--;
            }
            i++;
        }
        return targetNums;
    }
}
