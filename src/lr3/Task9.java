package lr3;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Enter size array: ");
        int size = id.nextInt();
        id.close();
        System.out.println("size array: " + size);

        int[] nums = new int[size];
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200); //
            System.out.println("Element array [" + i + "] = " + nums[i]);
        }

        int[] min_count = new int[size];
        int[] min_nums = new int[size];
        int min = nums[0];
        for (int l = 0; l < 2; l++) {
            for (int j = 0; j < nums.length; j++) {
                if (min >= nums[j]) {
                    min_count[j] = j;
                    min = nums[j];
                    min_nums[j] = nums[j];
                } else {
                    min_count[j] = 0;
                    min_nums[j] = 0;
                }
            }
        }

        for (int k = 0; k < nums.length; k++) {
            if (min_nums[k] == min && min_count[k] != 0) {
                System.out.println("Element array [" + min_count[k] + "]" + min_nums[k] + "- min value");
            }
        }

    }
}
