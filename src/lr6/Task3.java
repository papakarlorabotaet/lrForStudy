package lr6;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arrayOfNumb = {1,3,4,7,5,6,4};
        Number number = new Number(arrayOfNumb);
        Number number1 = new Number(1,2,3,5,6,7,8,9,10);

        number.print();
        number1.print();
    }
}
class Number{
    private int maxValue;
    private int minValue;
    private int averageValue;

    private int n;

    Number (int ... a){
        minValue = a[0];
        maxValue = a[0];
        for(int i = 0; i < a.length; i++){ //average
            n += a[i];


            if(minValue > a[i]){
                minValue = a[i];
            }
            if(maxValue < a[i]){
                maxValue = a[i];
            }
        }
        averageValue = n / a.length;

    }
    void print(){
        System.out.printf("max = %d, min = %d, average = %d\n\n", maxValue, minValue, averageValue);
    }
    
}
