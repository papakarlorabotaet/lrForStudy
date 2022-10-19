package lr2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number : ");

        double num = scan.nextDouble();

        if(5 <= num && num<= 10){
            System.out.println("between 5 to 10 inclusive - true");
        } else {
            System.out.println("between 5 to 10 inclusive - false");
        }
        scan.close();
        
    }
}
