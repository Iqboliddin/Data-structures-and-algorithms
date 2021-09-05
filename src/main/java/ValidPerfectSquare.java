import java.util.Scanner;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
            for (int i = 1; i <= num; i += 2) num -= i; return num == 0;
    }
}


