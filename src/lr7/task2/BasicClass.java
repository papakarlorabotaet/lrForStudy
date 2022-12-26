package lr7.task2;

public class BasicClass extends SuperClass {
    private int number;

    private String str;

    BasicClass() {
        setString();
    }

    BasicClass(String str) {
        setString(str);
    }

    BasicClass(int num) {
        setInt(num);
    }

    BasicClass(String str, int num) {
        setString(str);
        setInt(num);
    }

    public void setInt(int num) {
        this.number = num;
    }

    public int getInt() {
        return number;
    }

    public void setString() {
        this.str = "NULL";
    }

    public void setString(String str) {
        this.str = str;
    }

    public String getString() {
        return str;
    }

    public int strLength() {
        return str.length();
    }

    public void Show() {
        System.out.println(number);
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "Classname = " + getClass().getSimpleName() + "; string = \"" + getString() + "\""
                + " length = " + this.strLength() + "; total number = " +getInt() + "\n";
    }

}
