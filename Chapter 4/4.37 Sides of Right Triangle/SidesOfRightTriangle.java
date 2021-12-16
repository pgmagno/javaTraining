import java.util.Scanner;

public class SidesOfRightTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side 1 of the triangle: ");
        int x = input.nextInt();
        System.out.println("Enter the side 2 of the triangle: ");
        int y = input.nextInt();
        System.out.println("Enter the side 3 of the triangle: ");
        int z = input.nextInt();

        int hipotenusa;
        int cateto1;
        int cateto2;

        if (x > y && x > z) {
            hipotenusa = x;
            cateto1 = y;
            cateto2 = z;
        } else if (y > z && y > x) {
            hipotenusa = y;
            cateto1 = x;
            cateto2 = z;
        } else {
            hipotenusa = z;
            cateto1 = y;
            cateto2 = x;
        }

        if (Math.pow(hipotenusa, 2) == Math.pow(cateto1, 2) + Math.pow(cateto2, 2)) {
            System.out.println("It's a right triangle. 😄");
        } else {
            System.out.println("It's NOT a right triangle. ☹");
        }
    }
}
