package MissingNumber;

import java.util.Arrays;

public class Main {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);

        if (nums[0] != 0)
            return 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i + 1 < nums.length && nums[i + 1] != nums[i] + 1)
                return nums[i] + 1;
        }
        return nums.length;
    }
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,2}));
    }
}
