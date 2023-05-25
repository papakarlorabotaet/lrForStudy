package basicsOfProjectActivity;

import java.text.DecimalFormat;
import java.util.Scanner;

public class lr5 {

    static double[][] per = {
            {2,20,4},
            {4,32,8},
            {2,8,3},
            {2,26,6}
    };


    static double Ei(double[] pre){
        double tmp;
        tmp = (pre[0]+pre[2]*4+pre[1])/6;
        return tmp;
    }

    static double CKO(double[] pre){
        double tmp;
        tmp = (pre[1]-pre[0])/6;
        return tmp;
    }

    static double[][] CH(double[][] per, Scanner sc, int A){
        System.out.println("���:\t");
        System.out.print(">> ");
        per[A][0] = sc.nextDouble();
        System.out.println("����:\t");
        System.out.print(">> ");
        per[A][1] = sc.nextDouble();
        System.out.println("�������� ��������:\t");
        System.out.print(">> ");
        per[A][2] = sc.nextDouble();
        return per;
    }

    static void VasRUN(double[][] per,Scanner sc){
        double TMP3, TMP4, TMP5, TMP6, TMP7, TMP8, TMP9, TMP10;
        DecimalFormat dF = new DecimalFormat("#.##");
        System.out.print("������� ���������� ���������������� �������:\t|\t");
        int Ui = sc.nextInt();
        System.out.print("������� ���������� ������������ �������:\t\t|\t");
        int Act = sc.nextInt();
        System.out.print("������� ���������� ����� ������-��������:\t\t|\t");
        int Bo = sc.nextInt();
        System.out.print("������� ���������� ����� ������-�������:\t\t|\t");
        int Bm = sc.nextInt();
        System.out.println("\n����������� � �������:");
        System.out.println("\t - ��� ������ ������ - �� "+per[0][0]+" �� "+per[0][1]+" ����� (�������� �������� - "+per[0][2]+" ����)");
        System.out.println("[1] ������� ������������ ����������� ��������: "+ dF.format(Ei(per[0])));
        System.out.println("[2] ������������������ ���������� ��������: "+ dF.format(CKO(per[0])));
        System.out.println("\n\t - ��� ������ ����������� ������� - �� "+per[1][0]+" �� "+per[1][1]+" ����� (�������� �������� - "+per[1][2]+" �����");
        System.out.println("[1] ������� ������������ ����������� ��������: "+ dF.format(Ei(per[1])));
        System.out.println("[2] ������������������ ���������� ��������: "+ dF.format(CKO(per[1])));
        System.out.println("\n\t - ��� ������ ������-������� - �� "+per[2][0]+" �� "+per[2][1]+" ����� (�������� �������� - "+per[2][2]+" ����)");
        System.out.println("[1] ������� ������������ ����������� ��������: "+ dF.format(Ei(per[2])));
        System.out.println("[2] ������������������ ���������� ��������: "+ dF.format(CKO(per[2])));
        System.out.println("\n\t - ��� ���������� ������ ������-������ - �� "+per[3][0]+" �� "+per[3][1]+" ����� (�������� �������� "+per[3][2]+" �����)");
        System.out.println("[1] ������� ������������ ����������� ��������: "+ dF.format(Ei(per[3])));
        System.out.println("[2] ������������������ ���������� ��������: "+ dF.format(CKO(per[3])));

        System.out.print("\n_____________________________________________________________________________________");
        TMP3 = Ui * Ei(per[0]) + Act * Ei(per[1]) + Bo * Ei(per[2]) + Bm * Ei(per[3]);
        System.out.print("\n[3] ��������� ������������ ����������� �������: "+dF.format(TMP3)+" (��� * ���)");
        TMP4 = Math.sqrt(Ui*CKO(per[0])*CKO(per[0])+Act*CKO(per[1])*CKO(per[1])+Bo*CKO(per[2])*CKO(per[2])+Bm*CKO(per[3])*CKO(per[3]));
        System.out.print("\n__________________________________________________________________________________________");
        System.out.print("\n[4] ������������������ ���������� ��� ������ ��������� �����-������� ����������� ��������: "+dF.format(TMP4)+" (��� * ���)");
        TMP5 = TMP3+2*TMP4;
        System.out.print("\n___________________________________________________________________________________________");
        System.out.print("\n[5] ������ ��������� ������������ ����������� �������: "+dF.format(TMP5)+" (��� * ���)");
        TMP6 = (TMP4/TMP3)*100;
        System.out.print("\n____________________________________________________________________________________________");
        System.out.print("\n[6] ������������� ����������� � ������ ��������� ������������ �����������: "+dF.format(TMP6)+" (��� * ���)");
        TMP7 =4*TMP5;
        System.out.print("\n_________________________________________________________________________________________");
        System.out.print("\n[7] ����� ������������ �������: "+dF.format(TMP7)+" (��� * ���)");
        TMP9 = TMP7/132;
        System.out.print("\n_______________________________________________________________________________________");
        System.out.print("\n[9] �������� ��������-����� � ��������-������: "+dF.format(TMP9)+" (��� * ���)");
        TMP8 = 2.5 * Math.cbrt(TMP9);
        System.out.print("\n_____________________________________________________________________________________");
        System.out.print("\n[8] ����� ����� �����: "+dF.format(TMP8)+" (��� * ���)");
        TMP10 = TMP9/TMP8;
        System.out.print("\n______________________________________________________________________________________");
        System.out.print("\n[10] ������� ����������� �������: "+Math.ceil(TMP10)+" (���)");
        System.out.println("\n_______________________________�����________________________________________\n\n");
    };

    static void enterData(Scanner sc){

        System.out.println("\t������� ������������ ��� ������ ������");
        per = CH(per,sc,0);
        System.out.println("\t������� ������������ ��� ����������� �������");
        System.out.print(">> ");
        per = CH(per,sc,1);
        System.out.println("\t������� ������������ ��� ������ ������-�������");
        System.out.print(">> ");
        per = CH(per,sc,2);
        System.out.println("\t������� ������������ ��� ������ ������-������");
        System.out.print(">> ");
        per = CH(per,sc,3);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp;
        System.out.println();
        double[][] per = {
                {2,20,4},
                {4,32,8},
                {2,8,3},
                {2,26,6}
        };
        enterData(sc);




        while (true){

            System.out.println("____________________________________________________________________________________");
            System.out.println("1. ������");
            System.out.println("2. �������� ������������ �������������");
            System.out.println("3. ���������");
            System.out.println("___________________________________________________________________________________");
            System.out.print(">> ");
            tmp = sc.nextInt();

            if (tmp == 3){
                System.out.println("_____________________________���������� �������-��____________________________________");
                break;
            } else if (tmp == 2) {
                System.out.println("\t������� ������������ ��� ������ ������");
                per = CH(per,sc,0);
                System.out.println("\t������� ������������ ��� ����������� �������");
                System.out.print(">> ");
                per = CH(per,sc,1);
                System.out.println("\t������� ������������ ��� ������ ������-�������");
                System.out.print(">> ");
                per = CH(per,sc,2);
                System.out.println("\t������� ������������ ��� ������ ������-������");
                System.out.print(">> ");
                per = CH(per,sc,3);
            } else if (tmp == 1) {
                VasRUN(per,sc);
            }
        }
    }
}
