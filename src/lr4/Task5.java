package lr4;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random(200);
        Scanner id = new Scanner(System.in);
        System.out.print("Enter num columns: ");
        int a = id.nextInt();
        System.out.print("Enter num lines:");
        int b = id.nextInt();
        int[][] arrayOne = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arrayOne[i][j] = random.nextInt(200);
                System.out.println("i = " + i + "; j= " + j + "; value= " + arrayOne[i][j]);
            }
        }
        System.out.println("Reverse array");

        int[][] arrayTwo = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                arrayTwo[i][j] = arrayOne[j][i];
                System.out.println("i = " + i + ";j= " + j + ";value= " + arrayTwo[i][j]);
            }
        }
    }
}
