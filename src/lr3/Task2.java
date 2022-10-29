package lr3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day of week, and i'll show you num of day ");


        String day = scan.nextLine();

        switch (day) {
            case "Monday", "Mon":
                System.out.println(day + "- 1");
                break;
            case "Tuesday","Tue":
                System.out.println(day + "- 2");
                break;
            case "Wednesday","Wed":
                System.out.println(day  + "- 3");
                break;
            case "Thursday","Thur":
                System.out.println(day + "- 4");
                break;
            case "Friday","Fri":
                System.out.println(day + "- 5");
                break;
            case "Saturday","Sat":
                System.out.println(day + "- 6");
                break;
            case "Sunday","Sun":
                System.out.println(day + "- 7");
                break;
            default:
                System.out.println("i don't understand you, please repeat");

        }
    }
}
