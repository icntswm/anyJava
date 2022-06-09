package MoveZeroes;

public class Main {
    private static int returnPos(int[] nums, int startPos) {
        for (int i = startPos; i < nums.length; ++i) {
            if (nums[i] != 0)
                return i;
        }
        return -1;
    }
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
                int newPos = returnPos(nums, i);
                if (newPos == -1)
                    break;
                nums[i] = nums[newPos];
                nums[newPos] = 0;
            }
        }
        printResult(nums);
    }
    public static void main(String[] args) {
        moveZeroes(new int[] {0, 1, 0, 0, 2, 5, 9, 12, 0, 9, 0});
    }
    private static void printResult(int[] nums) {
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
