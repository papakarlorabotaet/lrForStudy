package lr2;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Name  : ");
        String name = in.nextLine();

        System.out.print("Input age  : ");
        int age = in.nextInt();

        System.out.printf("Name: %s\n\t Age: %d\n\t\t ", name, age);
        in.close();
    }
}
