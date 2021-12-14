// This app checks for the two highest number of sales
import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main (String[] args) {

        int counter = 1;
        int number = 0;
        int firstLargest = 0;
        int secondLargest = 0;

        Scanner input = new Scanner(System.in);
        while (counter <= 10) {
            System.out.print("Enter a number of sales: ");
            number = input.nextInt();

            if (number > firstLargest) {
                firstLargest = number;
            }
            if (number > secondLargest && number != firstLargest) {
                secondLargest = number;
            }
            counter++;
        }
        System.out.printf("The first largest number is: %d%n", firstLargest);
        System.out.printf("The second largest number is: %d%n", secondLargest);
    }
}
