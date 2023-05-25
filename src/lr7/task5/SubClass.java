package lr7.task5;

public class SubClass extends SuperClass {
    private int num;
    public SubClass(String str, int num) {
        super(str);
        this.num = num;
    }

    int getInt(){
        return num;
    }

    public String toString() {
        return super.toString() + "; number = "+ getInt();

    }
}
