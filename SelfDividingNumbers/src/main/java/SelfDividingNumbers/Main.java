package SelfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; ++i) {
            char[] arrLeft = Integer.toString(i).toCharArray();
            int counter = 0;

            for (int j = 0; j < arrLeft.length; ++j) {
                int num = Character.getNumericValue(arrLeft[j]);
                if (num != 0 && i % num == 0)
                    ++counter;
            }
            if (counter == arrLeft.length) {
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = selfDividingNumbers(1, 22);
        printList(list);
    }
    private static void printList(List<Integer> list) {
        for (int o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
