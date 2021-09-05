import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }

        String firstX = x + "";
        String str = "";
        while (x != 0) {
            str += x % 10;
            x /= 10;
        }
        return firstX.equals(str);
    }


    public static boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int reverseNum = 0, remainder;
        int originalNum = x;
        while (x != 0) {
            remainder = x % 10;
            reverseNum = reverseNum * 10 + remainder;
            x /= 10;
        }
        return originalNum == reverseNum;
    }
}
