package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1785DifficultiesOfLocalization {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        // decision
        int num = scan.nextInt();


        if(1<= num && num <=4){
            System.out.println("few");
        } else if (5<= num && num <=9) {
            System.out.println("several");
        }else if (10<= num && num <=19) {
            System.out.println("pack");
        }else if (20<= num && num <=49) {
            System.out.println("lots");
        }else if (50<= num && num <=99) {
            System.out.println("horde");
        }else if (100<= num && num <=249) {
            System.out.println("throng");
        }else if (250<= num && num <=499) {
            System.out.println("swarm");
        }else if (500<= num && num <=999) {
            System.out.println("zounds");
        } else if (1000<= num ) {
            System.out.println("legion");
        }


        // decision

        out.println();
        out.flush();
    }
}
