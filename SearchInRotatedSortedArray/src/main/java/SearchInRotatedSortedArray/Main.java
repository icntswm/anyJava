package SearchInRotatedSortedArray;

public class Main {
    private static int[] makeSortedArray(int[] nums) {
        int minPos = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < nums[minPos])
                minPos = i;
        }
        int[] newNums = new int[nums.length];
        int j = 0;
        for (int i = minPos; i < nums.length; ++i) {
            newNums[j++] = nums[i];
        }
        for (int i = 0; i < minPos; ++i) {
            newNums[j++] = nums[i];
        }

        return newNums;
    }
    public static int search(int[] nums, int target) {
        int[] newNums = makeSortedArray(nums);
        int findPos = -1;
        int mid = newNums.length / 2;
        int prevMid = newNums.length;
        while (true) {
            if (target > newNums[newNums.length - 1] || target < newNums[0])
                break ;
            if (newNums[mid] > target) {
                if (mid - 1 >= 0 && target < newNums[mid] && target > newNums[mid - 1])
                    break ;
                prevMid = mid;
                mid /= 2;
            } else if (newNums[mid] < target) {
                if (mid + 1 < newNums.length && target > newNums[mid] && target < newNums[mid + 1])
                    break ;
                mid = (mid + prevMid) / 2;
            } else {
                findPos = mid;
                break;
            }
        }
        if (findPos != -1) {
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] == newNums[findPos])
                    return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[] {4,5,6,7,0,1,2}, 5));
    }
    private static void printing(int[] nums) {
        for (int o: nums) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
