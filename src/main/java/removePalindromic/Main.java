package removePalindromic;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> start;
    private static ArrayList<Integer> end;

    public static void checkSubstring(int strLength, String s) {
        StringBuffer strBuf;
        for (int i = 0; i <= strLength; i++) {
            for (int j = i + 1; j <= strLength; ++j) {
                String checkStr = s.substring(i, j);
                strBuf = new StringBuffer(checkStr);
                strBuf.reverse();
                if (checkStr.equals(strBuf.toString())) {
                    start.add(i);
                    end.add(j);
                }
            }
        }
    }
    public static int removePalindromeSub(String s) {
        start = new ArrayList<>();
        end = new ArrayList<>();
        int strLength;
        int counter = 0;
        StringBuffer strBuf = new StringBuffer(s);
        strBuf.reverse();
        if (s.equals(strBuf.toString()))
            return 1;
        while (s.length() != 0) {
            strLength = s.length();
            checkSubstring(strLength, s);
            int maxDiff = 0;
            int maxStart = 0;
            int maxEnd = 0;
            for (int i = 0; i < start.size(); i++) {
                if (end.get(i) - start.get(i) > maxDiff) {
                    maxDiff = end.get(i) - start.get(i);
                    maxStart = start.get(i);
                    maxEnd = end.get(i);
                }
            }
            s = s.replace(s.substring(maxStart, maxEnd), "");
            start.clear();
            end.clear();
            counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        int steps = removePalindromeSub("ababbababababbabaaabbababbababbaaaa");
        System.out.println("it took me " + steps + " steps to completely clear the string from palindromes");
    }
}
