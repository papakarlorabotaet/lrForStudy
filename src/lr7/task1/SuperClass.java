package lr7.task1;

public class SuperClass {
    private String strFirst;

    SuperClass(String str){
        this.strFirst = str;
    }

    public String getStrFirst() {
        return strFirst;
    }

    public void setStrFirst(String strFirst) {
        this.strFirst = strFirst;
    }

    @Override
    public String toString() {
        String superNameAndValue;
        superNameAndValue = "Class name= " + getClass().getSimpleName() +
                "\nFirstString= " + getStrFirst();
        return superNameAndValue;
    }

}
