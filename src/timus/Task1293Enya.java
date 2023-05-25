package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1293Enya {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        // decision
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int res = a*b*c*2;
        // decision

        out.println(res);
        out.flush();
    }
}
