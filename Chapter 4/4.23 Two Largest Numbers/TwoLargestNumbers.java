// This app checks for the two highest number of sales
import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main (String[] args) {

        int counter = 1;
        int number;
        int largest = 0;
        int secondLargest = 0;

        Scanner input = new Scanner(System.in);
        while (counter <= 10) {
            System.out.print("Enter a number of sales: ");
            number = input.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            }
            counter++;
        }
        System.out.printf("The largest number is: %d%n", largest);
        System.out.printf("The second largest number is: %d%n", secondLargest);
    }
}