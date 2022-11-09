package lr4;

public class Task2 {
    public static void main(String[] args) {
        int height = 10;
        int z = 0;

        for (int i = 1; i <= height; i++) {
            for (int j = 0; j <= z; j++) {
                System.out.print("+");
            }
            z++;
            System.out.println();
        }
        System.out.printf("height : %d", height);
    }

}

