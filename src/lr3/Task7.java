package lr3;

public class Task7 {
    public static void main(String[] args) {
        int size = 10;
        char firstCharacter= '\u0061';
        char[] alphabet = new char[size];

        showAlphabet(alphabet, firstCharacter);
        System.out.println();
        reverseAlphabet(alphabet);
    }


    public static void reverseAlphabet(char[] charArray) {
        for (int i = charArray.length - 1 ; i >= 0; i--){
            System.out.print(charArray[i] + " ");
        }
    }
    public static void showAlphabet(char[] charArray, char letter) {
        for (int i = 0; i < charArray.length; i++){
            charArray[i] = letter;
            letter += 2;
            System.out.print(charArray[i] + " ");
        }
    }
}
