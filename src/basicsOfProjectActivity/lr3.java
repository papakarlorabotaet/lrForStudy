package basicsOfProjectActivity;

import java.util.Scanner;

public class lr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Введите запланированный бюджет проекта (у.е.):\t");
        float bdg = sc.nextFloat();
        System.out.print("Введите запланированный срок выполнения проекта (мес):\t");
        float t1 = sc.nextFloat();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Введите время проверки (мес):\t");
        float tFact = sc.nextFloat();
        System.out.print("Введите расходы (у.е.):\t");
        float bdgFact = sc.nextFloat();
        System.out.print("Введите степень готовности проекта (%):\t");
        float prep = sc.nextFloat();
        sc.close();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        float countM = 100 * bdgFact / prep;
        float countT = 100 * tFact / prep;
        System.out.println("Прогнозный расход бюджета составляет:\t" + countM + " у.е.");
        System.out.println("Прогнозный срок выполнения проекта:\t\t" + countT + " мес.");
        System.out.println("Задержка составит:\t\t" + (countT-t1) + " мес.");
        System.out.println("Перерасход составит:\t" + (countM-bdg) + " у.е.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}