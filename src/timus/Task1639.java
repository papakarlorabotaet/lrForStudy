package timus;

import java.util.Scanner;

public class Task1639 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if ((a * b - 1) % 2 == 0) System.out.println("[second]=:]");
        else System.out.println("[:=[first]");
    }
}

