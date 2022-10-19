package lr2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number : ");

        int num = scan.nextInt();
        System.out.println("amount of thousand - " + num/1000 );
        scan.close();
    }
}
