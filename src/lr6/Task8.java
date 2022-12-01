package lr6;

public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[]{4231, 3318, 32, 18, 848};
        System.out.print("Среднее значение элементов в массиве: " + Average.averageArray(array));
    }
}

class Average {
    static double averageArray(int[] nums) {
        double result = 0;
        for (int a = 0; a < nums.length; a++) {
            result += nums[a];
        }
        result /= nums.length;
        return result;
    }
}


