import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {
        int s = 0;
        while (num != 0) {
            s += num % 10;
            num /= 10;
        }
        if (s < 10)
            return s;
        else
            return addDigits(s);
    }
}
