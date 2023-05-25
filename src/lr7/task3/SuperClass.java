package lr7.task3;

public class SuperClass {
    public int num;

    void setNumber(int numb) {
        this.num = numb;
    }


    SuperClass(int num){
        this.num = num;

    }
    @Override
    public String toString() {
        return "ClassName = " + getClass().getSimpleName() +"------------- "+ num +";\n";
    }
}
