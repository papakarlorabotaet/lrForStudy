package lr3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first num - ");
        int userNumFirst = scan.nextInt();

        System.out.print("Enter second num - ");
        int userNumSecond = scan.nextInt();

        System.out.println("if you want use \"while\", send 1...\t or you want \"for\", send 2.");
        int answer = scan.nextInt();

        if(answer==1){
            System.out.println("Result from while : ");
            statementWhile(userNumFirst,userNumSecond);

        } else if (answer==2) {
            System.out.println("Result from for : ");
            statementFor(userNumFirst,userNumSecond);
        } else{
            System.out.println("incorrect answer");
        }



    }
    public static void statementFor(int num1, int num2){

        int numMax = 0;
        int numMin = 0;

        if(num1>num2){
            numMax = num1;
            numMin = num2;
        }

        if(num1<num2){
            numMax = num2;
            numMin = num1;
        }

        for(;numMax >= numMin; numMin++){
            System.out.println(numMin);
        }

    }

    public static void statementWhile(int num1, int num2){
        int numMax = 0;
        int numMin = 0;

        if(num1>num2){
            numMax = num1;
            numMin = num2;
        }

        if(num1<num2){
            numMax = num2;
            numMin = num1;
        }
        while(numMax >= numMin){
            System.out.println(numMin);
            numMin++;

        }
    }
}
