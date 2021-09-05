import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPowerOfFour2(n));
    }

    public static boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }

    public static boolean isPowerOfFour2(int n) {
        return Integer.toString(n, 4).matches("^10*$");
    }
}
