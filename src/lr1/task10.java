package lr1;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What day of the week is it today? : ");
        String thisDayWeek = in.nextLine();
        System.out.print("What month is it?  : ");
        String thisMonth = in.nextLine();
        System.out.print("What is the number of the day in the month?  : ");
        int thisDay = in.nextInt();
        System.out.printf("day of the week: %s\n\t today's date: %d\n\t\t it's %s now\n\t\t\t", thisDayWeek, thisDay, thisMonth);
        in.close();
    }
}
