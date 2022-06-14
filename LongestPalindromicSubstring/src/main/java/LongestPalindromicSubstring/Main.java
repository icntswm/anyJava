package LongestPalindromicSubstring;

import java.util.StringJoiner;

public class Main {
    public static String longestPalindrome(String s) {
        String maxStr = "";

        for (int i = 0; i < s.length(); ++i) {
            for (int j = i + 1; j <= s.length(); ++j) {
                String subStr = s.substring(i, j);

                if (subStr.length() > maxStr.length() && subStr.equals(new StringBuffer(subStr).reverse().toString())) {
                    maxStr = subStr;
                }
            }
        }
        return maxStr;
    }
    public static void main(String[] args) {
        String str = "abbacdoiwjefoiiiiowqwekg93820jgue028ht0188111j8g04j1oiiieepoowuu";
        System.out.println("result: " + longestPalindrome(str));
    }
}