import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(checkPerfectNumber(num));
    }

    public static boolean checkPerfectNumber(int num) {
        int s = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                s += i;
                if (i != num / i)
                    s += num / i;
            }
        }
        return num == s - num;
    }
}
