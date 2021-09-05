import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {

        if (n <= 0)
            return false;
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }
}
