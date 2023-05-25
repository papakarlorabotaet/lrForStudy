package lr3;

import java.util.Scanner;

public class Task3_1_for {
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
            System.out.print(first + " ");
            System.out.print(second+ " ");
            for (int i = 0; i < amount; i++) {
                int third = first + second;
                System.out.print(" "+third+" ");
                first = second;
                second = third;
            }


        }

    }

}
