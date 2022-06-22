package NumericalPuzzles;

import java.util.Scanner;

public class Main {
    final static private char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};

    private static int getPow(int num) {
        int count = 0;

        while (num != 0) {
            ++count;
            num /= 2;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; ++i) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < num; ++i) {
            if (i == 0)
                System.out.print(alphabet[getPow(arr[0]) - 1]);
            else
                System.out.print(alphabet[getPow(arr[i] - arr[i - 1]) - 1]);
        }
        System.out.println();
    }
}
