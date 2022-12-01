package lr6;

public class Task6 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int b = 4;
        for (int i = 0; i < Array.makeShazam(a, b).length; i++) {
            System.out.print(Array.makeShazam(a, b)[i] + "\t");
        }

    }
}

class Array {
    static int[] makeShazam(int[] nums, int num) {
        if (num > 0) {
            int[] resArr = new int[num];
            if (num > nums.length) {
                resArr = nums;
            } else if (num > 0) {
                resArr = new int[num];
                for (int i = 0; i < resArr.length; i++) {
                    resArr[i] = nums[i];
                }
            }
            return resArr;
        } else {
            int[] resArr = new int[0];
            return resArr;
        }

    }
}

