import java.util.Scanner;

public class RhombusOfStars {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        // prints the top and the middle
        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= n - rows; columns++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int columns = 1; columns < rows; columns++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        //prints the bottom
        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= n - rows; columns++) {
                System.out.print(" *");
            }
            System.out.println();

            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(" ");
            }
        }
    }
}
