import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isUgly2(n));
    }

    public static boolean isUgly(int n) {
        while (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) { //timeLimit
            if (n % 5 == 0)
                n = n / 5;
            if (n % 3 == 0)
                n = n / 3;
            if (n % 2 == 0)
                n = n / 2;
        }
        return n == 1;
    }

    public static boolean isUgly2(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 3 == 0) {
                n = n / 3;
            } else if (n % 5 == 0) {
                n = n / 5;
            } else {
                return false;
            }
        }
        return true;
    }
}
