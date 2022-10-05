package lr6;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Whats your name: ");
        String name = in.nextLine();

        System.out.print("Date of birth\ndd.mm.yyyy\t:" );
        String dateOfBirth = in.nextLine();

        System.out.printf("Name:\t\t\t<----%s \nDate of birth: \t\t\t<----%s ",name,dateOfBirth);
        in.close();
    }
}
