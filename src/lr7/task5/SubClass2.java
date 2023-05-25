package lr7.task5;

public class SubClass2 extends SuperClass {
    private char character;

    public SubClass2(String str, char character) {
        super(str);
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }

    public String toString(){
        return super.toString() + "; character = "+ getCharacter();
    }
}
