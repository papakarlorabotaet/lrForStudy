package lr1;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("For me to found out your year of birth\nEnter your age\n\t\t : ");

        int age = in.nextInt();

        int yearBirth = 2022- age;

        System.out.printf("Your year of birth :%d",yearBirth);

        in.close();
    }
}
