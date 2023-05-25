package lr1;

import java.util.Scanner;

public class Task19 {
    public static double hyp(double a, double b){
        return  Math.sqrt(a*a + b*b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Катет а =");
        double a = scan.nextDouble();

        System.out.println("Катет b =");
        double b = scan.nextDouble();

        System.out.printf("Гипотенуза = %.5f", hyp(a,b));

    }
}
