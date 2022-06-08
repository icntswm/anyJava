package searchInsert;

public class Main {
    public static int searchInsert(int[] nums, int target) {
        int pos = nums.length / 2;
        int prevPos = nums.length;

        if (target <= nums[0])
            return 0;
        else if (target > nums[nums.length - 1])
            return nums.length;

        while (true) {
            if (nums[pos] > target) {
                if ((pos - 1 >= 0 && target > nums[pos - 1]))
                    return pos;
                prevPos = pos;
                pos /= 2;
            } else if (nums[pos] < target) {
                if (pos + 1 < nums.length && target < nums[pos + 1])
                    return pos + 1;
                pos = (prevPos + pos) / 2;
            } else if (nums[pos] == target) {
                return pos;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}
