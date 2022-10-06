package lr1;

import java.util.Scanner;

import static java.lang.System.in;

public class task15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number: ");
        int first = scan.nextInt();

        System.out.println("Second number: ");
        int second = scan.nextInt();

        int total = first+second;

        System.out.printf("Total = %d",total);


    }
}
