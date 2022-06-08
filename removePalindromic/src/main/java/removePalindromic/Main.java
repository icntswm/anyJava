package removePalindromic;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Main {
    private static ArrayList<Integer> start;
    private static ArrayList<Integer> pos;
    private static ArrayList<Integer> end;

    public static void checkSubstring(int strLength, String s) {
        StringBuffer strBuf;
        ArrayList<Integer> rePos = new ArrayList<>();
        int maxLen = 0;
        for (int i = 0; i < strLength; i++) {
            StringJoiner checkStr = new StringJoiner("");
            for (int j = i; j < strLength; ++j) {
                checkStr.add(Character.toString(s.charAt(j)));
                strBuf = new StringBuffer(checkStr.toString());
                strBuf.reverse();
                rePos.add(j);
                if (checkStr.toString().equals(strBuf.toString()) && checkStr.toString().length() > maxLen) {
                    System.out.println(checkStr + " | " + strBuf);
                    maxLen = checkStr.toString().length();
                    pos.clear();
                    pos.addAll(rePos);
                    for (int e: pos
                         ) {
                        System.out.print(e + " ");
                    }
                }
            }
            rePos.clear();
        }
    }
    public static String removePos(String s) {
//        StringBuffer strBuf = new StringBuffer(s);
        String result = null;
        int counter = 0;
        for (int i = 0; i < pos.size(); ++i) {
//            System.out.println("pos.get(i): " + pos.get(i) + " | " + s);
            result = s.substring(0, pos.get(i) - counter) + s.substring(pos.get(i) - counter + 1);
            counter++;
            //            System.out.println("result: " + result);

        }
        System.out.println("delete string: " + result);
//        return strBuf.toString();
        return s;
    }
    public static int removePalindromeSub(String s) {
        if (s == null)
            return 0;
        StringBuffer strBuff = new StringBuffer(s);
        strBuff.reverse();
        if (s.equals(strBuff.toString()))
            return 1;
        return 2;
    }
    public static void main(String[] args) {
        int steps = removePalindromeSub("baabaaabb");
        System.out.println("\nit took me " + steps + " steps to completely clear the string from palindromes");
    }
}
