import java.util.Scanner;

public class SidesOfATriangle {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side 1 of the triangle: ");
        int x = input.nextInt();
        System.out.println("Enter the side 2 of the triangle: ");
        int y = input.nextInt();
        System.out.println("Enter the side 3 of the triangle: ");
        int z = input.nextInt();

        int count = 0;


        if (z > Math.abs(x - y) && z < x + y) {
            count++;
        }
        if (y > Math.abs(x - z) && y < x + z) {
            count++;
        }
        if (x > Math.abs(z - y) && x < z + y) {
            count++;
        }
        if (count == 3) {
            System.out.println("It's a triangle. 😄");
        } else {
            System.out.println("It's NOT a triangle. ☹");
        }

    }
}
