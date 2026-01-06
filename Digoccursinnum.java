
import java.util.Scanner;
public class Digoccursinnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = sc.nextInt();
        boolean found = false;
        while (n > 0) {
            int currentDigit = n % 10;
            if (currentDigit == digit) {
                found = true;
                break;
            }
            n = n / 10;
        }
        if (found) {
            System.out.println("Digit occurs in the number");
        } else {
            System.out.println("Digit does not occur in the number");
        }
        sc.close();
    }
}
