package RotateArray;

public class Main {
    public static void rotate(int[] nums, int k) {
        while (k > nums.length)
            k -= nums.length;
        int[] newNums = new int[nums.length];
        int j = 0;
        for(int i = nums.length - k; i < nums.length; i++) {
            newNums[j++] = nums[i];
        }
        for(int i = 0; i < nums.length - k; i++) {
            newNums[j++] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newNums[i];
        }
    }
    public static void main(String[] args) {
        rotate(new int[] {-1,-100,3,99}, 2);
    }
}
