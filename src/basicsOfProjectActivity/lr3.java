package basicsOfProjectActivity;

import java.util.Scanner;

public class lr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("������� ��������������� ������ ������� (�.�.):\t");
        float bdg = sc.nextFloat();
        System.out.print("������� ��������������� ���� ���������� ������� (���):\t");
        float t1 = sc.nextFloat();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("������� ����� �������� (���):\t");
        float tFact = sc.nextFloat();
        System.out.print("������� ������� (�.�.):\t");
        float bdgFact = sc.nextFloat();
        System.out.print("������� ������� ���������� ������� (%):\t");
        float prep = sc.nextFloat();
        sc.close();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        float countM = 100 * bdgFact / prep;
        float countT = 100 * tFact / prep;
        System.out.println("���������� ������ ������� ����������:\t" + countM + " �.�.");
        System.out.println("���������� ���� ���������� �������:\t\t" + countT + " ���.");
        System.out.println("�������� ��������:\t\t" + (countT-t1) + " ���.");
        System.out.println("���������� ��������:\t" + (countM-bdg) + " �.�.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}