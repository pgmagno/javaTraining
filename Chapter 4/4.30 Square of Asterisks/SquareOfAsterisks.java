import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {

        char block = '*';
        int side;
        int column;
        int row = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the square: ");
        side = input.nextInt();

        while (row < side) {
            column = 0;
            while(column < side) {
                if (row == 0 || row == side - 1) { // testing to see if we are in the first or last ROW, in which case
                    System.out.print(block);       // we print a block SIDE times (i.e. a full horizontal line of stars top and bottom)
                } else {                                   //if not
                    if (column > 0 && column < side - 1) { // since we are definitely in the middle rows, we check to see
                        System.out.print(" ");             // if we are in the middle columns, and so we print empty space
                    } else {                               // Now, if we are not in the middle columns, then we must be in the
                        System.out.print(block);           //  middle rows AND in the outside borders, so we print one block
                    }                                      // to create a vertical side line
                }
                column++;
            }
            System.out.println();
            row++;
        }
    }
}
