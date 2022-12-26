package lr7.task4;

public class SubClasss extends SuperClass {
    public String str;

    public void setChar1Str1 (char ch, String str) {
        super.ch = ch;
        this.str = str;
    }

    SubClasss(char ch, String str){
        super(ch);
        this.setChar1Str1(ch, str);
    }

    SubClasss(SubClasss copy) {
        super(copy.ch);
        this.setChar1Str1(copy.ch, copy.str);
    }
    String getStr (){
        return str;
    }

    public String toString() {
        return super.toString()  + "; string = " + this.getStr();

    }
}
