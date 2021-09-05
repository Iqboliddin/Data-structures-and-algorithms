import java.util.Scanner;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        if (s.equals("()"))
            return true;

        String firstStr = s.substring(0, s.length() / 2);
        String secondStr = s.substring(s.length() / 2);
        String res = "";
        int length = s.length() / 2;

        for (int i = length - 1; i > -1; i--) {
            res += firstStr.charAt(i);
        }
        return res.equals(secondStr);
    }
}