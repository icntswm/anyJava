public class Main {
    private static int bad;
    public static int firstBadVersion(int n) {
        long finalPos = 0;
        long pos = n / 2;
        long prevPos = n;

        if (n == 1)
            return 1;
        else if (isBadVersion(n) == true && isBadVersion(n - 1) == false)
            return n;
        while (finalPos == 0) {
            if (isBadVersion((int)pos) == true) {
                if (pos - 1 > 0 && isBadVersion((int)pos - 1) == false) {
                    finalPos = pos;
                    break;
                }
                prevPos = pos;
                pos /= 2;
            } else if (isBadVersion((int)pos) == false) {
                if (pos + 1 < n && isBadVersion((int)pos + 1) == true) {
                    finalPos = pos + 1;
                    break;
                }
                pos = (prevPos + pos) / 2;
            }
        }
        return ((int)finalPos);
    }
    public static boolean isBadVersion(int pos) {
        return pos > bad;
    }
    public static void main(String[] args) {
        bad = 1702766719;
        if (firstBadVersion(2126753390) == bad) {
            System.out.println("succes");
        } else {
            System.out.println("failed");
        }
    }
}
