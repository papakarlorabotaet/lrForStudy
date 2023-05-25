package lr7.task3;

public class SubSubClass extends SubClass{
    public String subSubString;

    SubSubClass(int integer, char character,String subSubString) {
        super(integer, character);
        this.subSubString = subSubString;
    }


    void setNumber(int integer, char character, String subSubString) {
        super.setNumber(integer, character);
        this.subSubString = subSubString;
    }

    @Override
    public String toString() {
        return "ClassName = " + getClass().getSimpleName() +"------------- "+ num + "; " + character +"; "+ subSubString + ";\n";
    }
}
