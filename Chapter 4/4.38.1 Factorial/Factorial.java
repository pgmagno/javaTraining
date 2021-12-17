import java.util.Scanner;

public class Factorial {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        int userNumber = -1;
        int total = 1;


        while (userNumber < 0) {
            System.out.println("Enter a number (larger or equal to 0) to find its factorial: ");
            userNumber = input.nextInt();
        }

        while (userNumber >= 1) {
            total *= userNumber;
            userNumber--;

        }
        System.out.println(total);

    }
}
