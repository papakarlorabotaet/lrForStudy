package lr6;

public class Task10 {
    public static void main(String[] args) {
        int[] a = new int[]{2735, 1242, 3421, 2182, 1252};

        System.out.println("min and max : ");
        a = MinAndMax.findMinAndMax(a);
        for (int b = 0; b < a.length; b++) {
            System.out.print(a[b] + "  ");
        }
    }
}

class MinAndMax {
    static int[] findMinAndMax(int... nums) {
        int[] console = nums;
        int[] count = new int[2];
        int max = 0;
        int min = 2147483647;
        for (int i = 0; i < console.length; i++) {
            if (max < console[i]) {
                max = console[i];
            }
            if (min > console[i]) {
                min = console[i];
            }
        }
        count[0] = min;
        count[1] = max;
        return count;
    }
}
