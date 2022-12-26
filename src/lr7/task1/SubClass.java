package lr7.task1;

public class SubClass extends SuperClass{

    private String strSecond;


    SubClass(String str) {
        super(str);
    }

    SubClass(String str1, String str2){
        super(str1);
        this.strSecond = str2;
    }

    public String getStrSecond() {
        return strSecond;
    }

    @Override
    public String toString() {
        String superNameAndValue;
        superNameAndValue = "Class name= " + getClass().getSimpleName() +
                "\nFirstString= " + getStrFirst() +
                "\nSecondString= " + getStrSecond();
        return superNameAndValue;
    }
}
