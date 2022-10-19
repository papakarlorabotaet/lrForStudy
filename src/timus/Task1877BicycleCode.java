package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1877BicycleCode {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        // decision
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1%2==0 || num2%2!=0 ){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        // decision

        out.println();
        out.flush();
    }
}
