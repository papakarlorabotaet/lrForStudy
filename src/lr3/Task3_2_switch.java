package lr3;

import java.util.Scanner;

public class Task3_2_switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Amount number of Fibonacci");

        int amount = scan.nextInt();

        int first = 1;
        int second = 1;

        if(amount< 1){
            System.out.println("please, enter positive num");
        }

        if(amount == 1){
            System.out.print(first);
        }

        if(amount == 2){
            System.out.print(first + " " + second);
        }

        if(amount == 3){
            System.out.print(first + " " + second + " 2" );
        }

        if (amount >= 4) {
            System.out.print(first + " " + second);
            int fib = 2, i = 2;
            while (i < amount) {
                fib = first + second;
                first = second;
                second = fib;
                System.out.print(" " + fib);
                i++;
            }
        }


    }
}

