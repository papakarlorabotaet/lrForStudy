package lr5;

public class Task5 {
    public static void main(String[] args) {
        TestClass example = new TestClass(21);
        example.printValue();

        example.setValue(); //0
        example.printValue();

        example.setValue(101);
        example.printValue();

        example.setValue(-1);
        example.printValue();

        example.setValue(99);
        example.printValue();
    }

    public static class TestClass {
        private int argument;

        TestClass(int a) {
            this.setValue(a);
        }

        public void setValue(int n) {
            if (n >= 100) {
                argument = 100;
            } else if (n <= 0) {
                argument = 0;
            } else if (n > 0 && n < 100) {
                argument = n;

            }
        }

        public void setValue() {
            argument = 0;
        }

        public void printValue() {
            System.out.println(argument);
        }
    }
}
