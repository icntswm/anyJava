package LongestSubstringWithoutRepeatingCharacters;

public class Main {
    private static Boolean checkUniqueString(String s) {
        boolean[] charArr = new boolean[256];

        for (int i = 0; i < s.length(); ++i) {
            if (charArr[s.charAt(i)])
                return false;
            charArr[s.charAt(i)] = true;
        }
        return true;
    }
    public static int lengthOfLongestSubstring(String s) {
        String maxString = "";
        int startPos = 0;

        for (int i = 1; i <= s.length(); ++i) {
            String subStr = s.substring(startPos, i);
            boolean uniqueStr = checkUniqueString(subStr);
            if (uniqueStr && subStr.length() > maxString.length()) {
                maxString = subStr;
                startPos = i - subStr.length();
            } else if (!uniqueStr) {
                startPos = i - subStr.length() + 1;
            }
        }
        return maxString.length();
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" fpo ijefj eirjf epojr f"));
    }
}
