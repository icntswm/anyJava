package SquaresSortedArray;

public class Main {
    public static int[] sortedSquares(int[] nums) {
        int[] resArr = new int[nums.length];
        int k = 0;
        for (int i : nums) {
            resArr[k++] = i * i;
        }
        for (int i = 0; i < resArr.length; i++) {
            for (int j = i + 1; j < resArr.length; j++) {
                if (resArr[j] < resArr[i]) {
                    int saveI = resArr[j];
                    resArr[j] = resArr[i];
                    resArr[i] = saveI;
                }
            }
        }
        return  resArr;
    }
    public static void main(String[] args) {
        int[] arr = sortedSquares(new int[] {-4, -1, 0, 3, 10});
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
