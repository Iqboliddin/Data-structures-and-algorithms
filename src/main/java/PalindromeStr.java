import java.util.Scanner;

public class PalindromeStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i > -1; i--) {
            reversedStr += (str.charAt(i));
        }
        if (str.equals(reversedStr))
            return true;
        return false;
    }
}
