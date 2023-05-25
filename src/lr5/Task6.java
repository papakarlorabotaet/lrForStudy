package lr5;

public class Task6 {
    public static void main(String[] args) {
        TestClass first = new TestClass(4, 9);
        first.printValue();

        TestClass second = new TestClass(7);
        second.printValue();

        second.setValue(-8);
        second.printValue();

        second.setValue(1, 12);
        second.printValue();


    }

    static class TestClass {
        private static int min;
        private static int max;
        TestClass(int n1, int n2) {
            min = Math.min(n1, n2);
            max = Math.max(n1, n2);
        }
        TestClass(int n) {
            min =0; max = 0;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        public void setValue(int n1, int n2) {
            min = Math.min(Math.min(n1, min), n2);
            max = Math.max(Math.max(n1, max), n2);
        }
        public void setValue(int n) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        public void printValue() {
            System.out.println("min = " + min);
            System.out.println("max = " + max + "\n\n");
        }
    }
}

