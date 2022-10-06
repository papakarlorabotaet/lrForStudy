package lr1;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("For me to found out your age\nEnter year of birth\n\t\t : ");

        int yearbirth = in.nextInt();

        int age = 2022- yearbirth;

        System.out.printf("Your age :%d",age);

        in.close();
    }
}
