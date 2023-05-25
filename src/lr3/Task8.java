package lr3;

public class Task8 {

    public static void main(String[] args) {
        int n = 10;
        char[] charArray = new char[n];
        char b = '\u0041';
        int i = 0;
        int j = 0;


        for (i = 0; i < n; i++) {
            Boolean statement = true;
            for (j = 0; j < vowels.length; j++) {
                if (b == vowels[j]) {
                    i--;
                    statement = false;
                    break;
                }
            }
            if (statement) {
                charArray[i] = b;
            }
            b++;
        }
        printArray(charArray,n);
    }

    public static char[] vowels = new char[]{'A', 'E', 'I', 'O', 'U', 'Y'};

    public static void printArray(char[] array, int sizeGeneralArray) {
        for (int k = 0; k < sizeGeneralArray; k++) {
            System.out.print(array[k] + "\t");
        }
    }

}

