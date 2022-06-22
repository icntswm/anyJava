package BinaryMedian;

import java.util.*;

public class Main {
    static private ArrayList<Integer> arr;
    static private String strFirst;
    static private String strSecond;
    private static void makeArray(int num, String str) {
        arr = new ArrayList<>();

        for (int i = 0; i < num; ++i) {
            arr.add(Integer.parseInt(Character.toString(str.charAt(i))));
        }
    }
    private static int checkZeroOne(int i, int j) {
        int countZero = 0;
        int countOne = 0;

        for (; i <= j; ++i) {
            if (arr.get(i) == 0)
                ++countZero;
            else
                ++countOne;
        }
        if (countOne > countZero)
            return 1;
        else if (countZero > countOne)
            return 0;
        return -1;
    }
    private static String makeWork(int start, int end) {
        StringBuilder str = new StringBuilder();
        int print;
        for (; start < end; ++start) {
            print = -1;
            for (int j = 0; j < start; ++j) {
                if (checkZeroOne(j, start) == arr.get(start)) {
                    print = j + 1;
                    break ;
                }
            }
            str.append(print).append(" ");
        }
        return str.toString();
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        makeArray(in.nextInt(), in.next());
        Thread tr1 = new Thread(() -> strFirst = makeWork(0, arr.size() / 2));
        tr1.start();
        strSecond = makeWork(arr.size() / 2, arr.size());
        tr1.join();
        System.out.println(strFirst + strSecond);
    }
}
