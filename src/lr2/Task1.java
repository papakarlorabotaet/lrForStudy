package lr2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        double num = scan.nextDouble();
        double numDividedThree = num / 3;

        if(num%3==0){
            System.out.printf("without remainder,Your num / 3 = %.2f",numDividedThree);
        }else {
        System.out.printf("with remainder, Your num / 3 = %.2f",numDividedThree);
        }
        scan.close();
    }
}
