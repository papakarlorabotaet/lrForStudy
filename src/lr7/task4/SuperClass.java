package lr7.task4;

public class SuperClass {

    char ch;

    SuperClass(char ch) {
        setCh(ch);
    }

    public SuperClass() {
    }

    void setCh(char ch) {
        this.ch = ch;
    }

    char getCh() {
        return ch;
    }

    @Override
    public String toString() {
        return "ClassName: " + this.getClass().getSimpleName() + "; " +
                        " symbol = " + this.getCh();

    }
}

