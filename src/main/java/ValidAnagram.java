import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strS = scanner.next();
        String strT = scanner.next();
        System.out.println(isAnagram(strS, strT));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar, tChar);
    }
}
