package lr9.exercises1_3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int[][] isArr;
        Random random = new Random();
        Scanner l = new Scanner(System.in);
        try {
            System.out.println("������� ���������� �������� � �������: ");
            int column = l.nextInt();
            System.out.println("������� ���������� ����� � �������: ");
            int line = l.nextInt();
            isArr = new int[line][column];
            for (int a = 0; a < line; a++){
                for (int b = 0; b < column; b++){
                    isArr[a][b] = random.nextInt(200);
                }
            }

            for (int a = 0; a < line; a++){
                for (int b = 0; b < column; b++){
                    System.out.print(" " + isArr[a][b] + " ");
                }
                System.out.println();
            }

            System.out.println("������� ����������� ����� ������� ��� ������: ");
            int num = l.nextInt() - 1;
            for (int a = 0; a < line; a++){
                System.out.println(isArr[a][num]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("����� ������� ��������� �� ��������� �������");
        }
        catch (InputMismatchException e){
            System.out.println("������� ������������ �����");
        }
    }
}
