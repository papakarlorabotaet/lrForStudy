package lr7.task5;

class SuperClass {
    private String str;

    public SuperClass(String str){
        this.str = str;
    }

    String getStr (){
        return str;
    }

    public String toString() {
        return "ClassName: " + this.getClass().getSimpleName() + "; string = " + this.getStr();


    }
}
