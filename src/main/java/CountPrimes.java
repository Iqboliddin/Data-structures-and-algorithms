import java.util.ArrayList;
import java.util.Scanner;

public class CountPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        countPrimes(n);
    }

    public static void countPrimes(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i < n + 1; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                arr.add(i);
                isPrime = false;
            }
        }
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
