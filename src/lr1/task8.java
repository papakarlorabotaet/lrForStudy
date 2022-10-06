package lr1;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Name  : ");
        String name0 = in.nextLine();
        System.out.print("Input Surname  : ");
        String name1 = in.nextLine();
        System.out.print("Input ot4estvo  : ");
        String name3 = in.nextLine();
        System.out.printf(" \n\nHallo \t\t%s\n \t\t\t%s\n \t\t\t%s\n", name0, name1, name3);
        in.close();
    }

}