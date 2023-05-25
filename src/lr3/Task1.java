package lr3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1-7 for view day of week");


        int num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println(num + " - Mon");
                break;
            case 2:
                System.out.println(num + " - Tue");
                break;
            case 3:
                System.out.println(num + " - Wed");
                break;
            case 4:
                System.out.println(num + " - Thur");
                break;
            case 5:
                System.out.println(num + " - Fri");
                break;
            case 6:
                System.out.println(num + " - Sat");
                break;
            case 7:
                System.out.println(num + " - Sun");
                break;
            default:
                System.out.println("incorrect num, please restart program");

        }
    }
}
