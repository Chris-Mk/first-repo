package RecursiveMethods;

public class RoadsInMaze {
    private static char[][] lab = {
            {' ', ' ', ' ', '*', ' ', ' ', ' '},
            {'*', '*', ' ', '*', ' ', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', '*', '*', '*', '*', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', 'е'},
    };

    private static char[] path = new char[lab[0].length * lab.length];
    private static int position = 0;

    private static void findPath(int row, int col, char direction) {
        if ((col < 0) || (row < 0) || (col >= lab[0].length) || (row >= lab.length)) {
            // We are out of the labyrinth
            return;
        }

        // Append the direction to the path
        path[position] = direction;
        position++;

        // Check if we have found the exit
        if (lab[row][col] == 'е') {
            printPath(path, position - 1);
        }

        if (lab[row][col] == ' ') {
            // The current cell is free. Mark it as visited
            lab[row][col] = 's';

            // Invoke recursion to explore all possible directions
            findPath(row, col - 1, 'L'); // left
            findPath(row - 1, col, 'U'); // up
            findPath(row, col + 1, 'R'); // right
            findPath(row + 1, col, 'D'); // down

            // Mark back the current cell as free
            lab[row][col] = ' ';
        }

        position--;
    }

    private static void printPath(char[] path, int endPos) {
        System.out.print("Found path to the exit: ");

        for (int pos = 1; pos <= endPos; pos++) {
            System.out.print(path[pos]);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        findPath(0, 0, 'S');
    }
}
