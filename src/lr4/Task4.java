package lr4;

public class Task4 {
    public static void main(String[] args) {
        int height = 15;
        int z = 0;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j <= z; j++) {
                System.out.print("+");
            }
            z = z + 1;
            System.out.println();
        }
    }
}
