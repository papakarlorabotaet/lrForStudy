package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1409 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        // decision


        Scanner scanner = new Scanner(System.in);
        int H, L;
        H = scanner.nextInt();
        L = scanner.nextInt();

        // decision

        out.println((L - 1) + " " + (H - 1));
        out.flush();
    }
}
