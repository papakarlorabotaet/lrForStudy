package lr5;

public class Task1 {
    public static void main(String[] args) {
        CharacterClass Symbol = new CharacterClass();
        Symbol.setCharacter('E');
        Symbol.viewCode();
    }

    public static class CharacterClass {
        private char character;

        public void setCharacter(char char1) {
            this.character = char1;
        }

        public int getCharacter() {
            return this.character;
        }

        public void viewCode() {
            System.out.printf("char = %c (code: %d)%n", character, getCharacter());
        }
    }
}

