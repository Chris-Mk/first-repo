package sumNumbers;

import java.util.Scanner;

public class SumNum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");

        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        int sum = 1;

        System.out.print("The sum 1");

        while (num < n) {
            num++;
            sum += num;
            System.out.printf("+%d", num);
        }
        System.out.printf(" = %d%n", sum);
    }
}
