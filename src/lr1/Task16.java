package lr1;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number: ");
        int numberFromUser = scan.nextInt();

        int first = --numberFromUser;
        int third = numberFromUser++;
        int fourth = first*first+numberFromUser*numberFromUser+third*third;

        System.out.printf("\nyour --num = %d,\nnum = %d,\nnum++ = %d,\n--num^2 + num^2 + num++^2 = %d\n\n",
                first,numberFromUser,third,fourth);
    }
}
