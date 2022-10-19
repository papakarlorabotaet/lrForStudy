package lr2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num and im trying division on 5 and 7 with remainder 2 and 1 respectively");

        int num = scan.nextInt();
        if(num%5 == 2){
            System.out.println("your num = " + num + " :5 remainder of the division = 2");
            if(num%7 == 1){
                System.out.println("your num " + num + " :7 remainder of the division = 1");

            }
        }else {
            System.out.println("lost");
        }
        scan.close();
    }
}
