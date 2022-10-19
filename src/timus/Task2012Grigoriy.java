package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task2012Grigoriy {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        // decision
        int num = scan.nextInt();

        if(num > 6){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


        // decision

        out.println();
        out.flush();
    }
}
