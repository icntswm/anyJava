package RansomNote;

import java.util.Arrays;

public class Main {
    private static char[] copyArr(char[] arr, int skip) {
        char[] newArr = new char[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length && j < newArr.length; ++i) {
            if (i != skip)
                newArr[j++] = arr[i];
        }
        return newArr;
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] firstStr = ransomNote.toCharArray();
        char[] secondStr = magazine.toCharArray();

        Arrays.sort(firstStr);
        Arrays.sort(secondStr);

        int counter = 0;
        for (int i = 0; i < firstStr.length; ++i) {
            int pos = Arrays.binarySearch(secondStr, firstStr[i]);
            if (pos >= 0) {
                secondStr = copyArr(secondStr, pos);
                ++counter;
            }
        }
        if (counter == firstStr.length)
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"));
    }
}
