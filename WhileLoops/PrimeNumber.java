import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();
        int divider = 2;
        int maxDivider = (int) Math.sqrt(num);
        boolean prime = true;

        while (prime && (divider <= maxDivider)) {
            if (num % divider == 0) {
                prime = false;
            }
            divider++;
        }
        System.out.println("Prime? " + prime);
    }
}
