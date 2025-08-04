import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // e.g. 10 to find the 10th prime
        int count = 0;
        int num = 2;

        while (count < n) {
            int div = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    div++;
                }
            }
            if (div == 2) {
                count++;
            }
            if (count == n) {
                System.out.println(num); // nth prime number
                break;
            }
            num++;
        }
    }
}
