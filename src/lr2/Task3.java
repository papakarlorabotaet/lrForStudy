package lr2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num>10 and  : 4 with remainder = 0 ");

        int num = scan.nextInt();

        if(num>=10 && num%4==0){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE\t read the instruction ");
        }

    }
}
