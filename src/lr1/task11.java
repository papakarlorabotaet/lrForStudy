package lr1;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What mount is it? : ");
        String thisDayWeek = in.nextLine();

        System.out.printf("Days in %s ?  : ",thisDayWeek);
        int thisDay = in.nextInt();

        System.out.printf("\t %S has %d days ", thisDayWeek, thisDay);
        in.close();
    }
}
