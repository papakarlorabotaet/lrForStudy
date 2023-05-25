package lr7.task3;

public class SubClass extends SuperClass {
    public char character;

    public SubClass(int integer, char character) {
        super(integer);
        this.character = character;
    }



    void setNumber(int numb, char character) {
        super.setNumber(numb);
        this.character = character;
    }
    @Override
    public String toString() {
        return "ClassName = " + getClass().getSimpleName() +"------------- "+ num + "; " + character + ";\n";
    }
}
