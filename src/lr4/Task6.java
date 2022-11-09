package lr4;

import java.util.Random;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Random random = new Random(200);
        Scanner id = new Scanner(System.in);
        System.out.print("Enter num lines:");
        int a = id.nextInt();

        System.out.print("Enter num columns: ");
        int b = id.nextInt();
        int firstArray[][] = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                firstArray[i][j] = random.nextInt(200);
                System.out.println("value= "+firstArray[i][j]);
            }
        }
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        int deleteNumLines = random.nextInt(a-1);
        int deleteNumColumns = random.nextInt(b-1);

        System.out.println("deleteNumLines = "+(deleteNumLines)+";deleteNumColumns= "+(deleteNumColumns));
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        int secondArray[][] = new int[a-1][b-1];
        for (int i=0, s = 0; i<a-1; s++) {
            if (s!=deleteNumLines){
                for (int j =0, k = 0 ; j <b-1; k++) {
                    if (k != deleteNumColumns) {
                        secondArray[i][j] = firstArray[s][k];
                        System.out.println("value= " + secondArray[i][j]);
                        j++;
                    }
                }
                i++;
            }
        }
    }
}

