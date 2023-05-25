package lr4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Enter num lines: ");
        int a =id.nextInt();

        System.out.print("Enter num columns: ");
        int b = id.nextInt();
        int[][] arraySnake = new int[a][b];
        int totalValue = 0;
        int totalFilling = 0;
        int totalLines = 0;
        for (int i = 0; totalLines < arraySnake.length ; totalLines++) {
            for (int j = 0; j <(arraySnake[i].length - totalValue); j++) {
                arraySnake[i][j] = totalFilling;
                totalFilling++;
            }
            if(i< arraySnake.length-1) {
                i++;}
            for (int o=a-1; o > totalValue; o--) {
                arraySnake[o][arraySnake[i].length-1-totalValue] = totalFilling;
                totalFilling++;
            }
            totalValue++;
        }
        int z = 0;
        for (int i = 0; i < arraySnake.length; i++){
            int count = i+1;
            System.out.print("Total num line " + count + " : ");
            for (int j = 0; j < arraySnake[i].length; j++){
                System.out.print(arraySnake[i][j]+" ");
                z++;
            }
            System.out.println("Total char  " + z);
            z = 0;
        }
    }
}

