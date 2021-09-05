import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if (n <= 0)
            return false;
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }

    public static boolean isPowerOfThree2(int n) {
        return Integer.toString(n, 3).matches("^10*$");
    }
}
