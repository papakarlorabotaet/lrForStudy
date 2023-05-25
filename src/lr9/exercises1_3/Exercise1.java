package lr9.exercises1_3;

import java.util.Scanner;

public class Exercise1 {
    public static double average(int[] arr) {
        double sum = 0;
        for (double a : arr) {
            sum += a;
        }
        return sum/arr.length;
    }
    public static void interrogation() {
        System.out.print("������� ���������� ��������� ������� �������: ");
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        int numb, count = 0;
        int[] arr = new int[c];
        for (int a = 0; a < c; a++) {
            count++;
            System.out.print("������� ����� �"+count+": ");
            numb = scan.nextInt();
            if (numb < 0) {
                throw new NegativeArraySizeException("����� ������ 0");
            }
            arr[a] = numb;
        }
        System.out.println("������� �������������� = " + average(arr));
    }
    public static void main(String[] args) {
        try {
            interrogation();
        } catch(NegativeArraySizeException e) {
            System.out.println("������� ������������� �������� �����");
        } catch (Exception e){
            System.out.println("������ �� ������ ��� �����");
        }
    }
}
