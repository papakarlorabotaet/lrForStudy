package lr7.task2;

public class SuperClass {
    private String str;

    SuperClass(){
        setString();
    }

    SuperClass(String str){
        setString(str);
    }

    public void setString(String str) {
        this.str = str;
    }
    public void setString() {
        this.str = "NULL";
    }

    public String getString(){
        return str;
    }

    public int strLength(){
        return str.length();
    }

    @Override
    public String toString() {
        return "Classname = " + getClass().getSimpleName() + "; string = \"" + getString() + "\""
                + " length = " + strLength() + "\n";
    }
}
