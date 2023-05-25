package lr7.task4;

public class SubSubClasss extends SubClasss {

    int num;

    public void setCharStrInt (char ch, String str, int num){
        super.ch = ch;
        super.str = str;
        this.num = num;
    }
    SubSubClasss(char ch, String str, int num){
        super(ch,str);
        this.setCharStrInt(super.ch,super.str, num);
    }

    public int getInt() {
        return num;
    }

    public String toString() {
        return super.toString() + "; num = " + this.getInt();
    }
}
