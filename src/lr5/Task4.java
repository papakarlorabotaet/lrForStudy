package lr5;

public class Task4 {
    public static void main(String[] args) {
        SymbolAndIntClass withTwo = new SymbolAndIntClass(12, 'A');
        SymbolAndIntClass withOne = new SymbolAndIntClass(65.1267);
    }

    static class SymbolAndIntClass {
        private char character;
        private int inttttteger;
        SymbolAndIntClass(int i, char c) {
            this.character = c;
            this.inttttteger = i;
            int length = (int) (Math.log10(inttttteger) + 1);
            double result = (double) character + (double) inttttteger * 1 / Math.pow(10, length);
            System.out.println("result1 = " + result + "; ch = " + (double) character + "; int = " + length + "\n");
        }

        SymbolAndIntClass(double d) {
            char ch1 = (char) d;
            inttttteger = (int) ((d - (int) d) * 100);
            System.out.println("ch = " + ch1 + "; int = " + inttttteger + "\n");
        }
    }
}

