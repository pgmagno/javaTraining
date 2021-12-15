public class CheckerboardOfAsterisks {
    public static void main(String[] args) {

        int length = 10;
        int row = 0;
        int col;

        while (row < length) {
            col = 0;
            while (col < length) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            if (row % 2 == 0) {
                System.out.print(" ");
            }
            row++;
        }
    }
}
