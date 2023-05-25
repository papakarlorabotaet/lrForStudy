package lr6;

public class Task9 {
    public static void main(String[] args) {
        char[] test = new char[]{'a','b','c'};
        System.out.println(Reverse.reverseArrays(test));
        char[] test2 = new char[]{'a','b','c','d','e','f','g'};
        System.out.println(Reverse.reverseArrays(test2));
    }
    static class Reverse {
        static char[] reverseArrays(char[] chars){
            char[] newChars = new char[chars.length];
            for (int i=0;i< chars.length;i++){
                newChars[i]=chars[chars.length-1-i];
            }
            return newChars;
        }
    }
}