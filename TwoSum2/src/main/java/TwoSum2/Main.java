package TwoSum2;

public class Main {
    public static int[] twoSum(int[] numbers, int target) {
        int[] resArr = new int[2];

        for (int i = 0; i < numbers.length; ++i) {
            while (i + 2 < numbers.length && numbers[i + 2] == numbers[i] && numbers[i + 1] == numbers[i])
                i++;
            for (int j = i + 1; j < numbers.length; ++j) {
                if (numbers[i] + numbers[j] == target) {
                    resArr[0] = ++i;
                    resArr[1] = ++j;
                    break;
                }
            }
        }
        return resArr;
    }
    public static void main(String[] args) {
        int[] res = twoSum(new int[] {2,7,11,15}, 9);
        for (int i:res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
