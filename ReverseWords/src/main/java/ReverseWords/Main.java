package ReverseWords;

public class Main {
    public static String reverseWords(String s) {
        int counter = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ' ')
                ++counter;
        }

        String[] arrStrings = new String[counter + 1];
        counter = 0;
        int j = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ' ') {
                arrStrings[j++] = s.substring(counter, i);
                counter = ++i;
            }
            if (i == s.length() - 1)
                arrStrings[j] = s.substring(counter);
        }

        for (int i = 0; i < arrStrings.length; ++i) {
            arrStrings[i] = new StringBuffer(arrStrings[i]).reverse().toString();
            if (i != arrStrings.length - 1)
                arrStrings[i] += " ";
        }

        return String.join("", arrStrings);
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("Hi all! How are you? How is your health?"));
    }
}
