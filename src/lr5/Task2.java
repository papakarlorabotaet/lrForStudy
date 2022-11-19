package lr5;

public class Task2 {
    public static void main(String[] args) {
        ClassOfSymbol SymbolFirst = new ClassOfSymbol();
        ClassOfSymbol SymbolSecond = new ClassOfSymbol();

        SymbolFirst.setCharacterValue('A', 'D');
        SymbolFirst.showCharacterArrays();
        System.out.println();
        SymbolSecond.setCharacterValue('C', 'F');
        SymbolSecond.showCharacterArrays();
    }

    static class ClassOfSymbol extends Task2 {
        private char ch1, ch2;
        protected void setCharacterValue(char ch1, char ch2) {
            this.ch1 = ch1;
            this.ch2 = ch2;
        }
        protected void showCharacterArrays() {
            int int1 = this.ch1;
            int int2 = this.ch2;

            if (int1 > int2) {
                int1 = this.ch2;
                int2 = this.ch1;
            }

            for (int i = int1; i <= int2; i++) {
                System.out.print((char)i);
            }
        }
    }
}

