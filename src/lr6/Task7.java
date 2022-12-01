package lr6;

public class Task7 {
    public static void main(String[] args) {
        char[] test = new char[]{'A',']','/'};
        System.out.print("Коды символов A,],/ :  ");
        for (int a=0;a< test.length;a++){
            System.out.print(charracter.charToNum(test)[a] + " ");
        }
    }
    static class charracter {
        static int[] charToNum(char[] ic){
            int[] arg = new int[ic.length];
            for (int a=0;a<arg.length;a++){
                arg[a]=ic[a];
            }
            return arg;
        }
    }
}
