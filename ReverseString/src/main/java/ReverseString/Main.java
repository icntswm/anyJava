package ReverseString;

public class Main {
    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; ++i) {
            char saveChar = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = saveChar;
        }

        printing(s);
    }
    public static void main(String[] args) {
        reverseString(new char[] {'h','e','l','l','o'});
    }
    private static void printing(char[] s) {
        for (char o: s) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
