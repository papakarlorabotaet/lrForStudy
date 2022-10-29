package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size array: ");
        int arraySize = scan.nextInt();
        scan.close();
        sortingArrayAndPrint(randomArray(arraySize));




    }
    public static int [] randomArray(int size){
        Random random = new Random();
        int [] randomArray = new int[size];
        for(int i = 0; i < randomArray.length; i++ ){
            randomArray[i] = random.nextInt();
            System.out.println("Element array [" + i + "] = " + randomArray[i]);
        }
        return randomArray;

    }

    public static int [] sortingArrayAndPrint(int [] array ){
        boolean isSorted = false;
        int buf;
        while (!isSorted){
            isSorted = true;
            for(int i = 0; i < array.length-1; i++){
                if(array[i] < array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println("\n\tSorted array: \n");
        for(int i = 0; i < array.length; i++){
            System.out.println("\t\tElement array [" + i + "] = " + array[i]);
        }
        return array;
    }
}
