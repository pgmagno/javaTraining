import java.util.Scanner;

public class LargestNumber {
    public static void main (String[] args) {

        int counter = 0;
        int  number =0;
        int largestNumber = 0;
        Scanner input = new Scanner (System.in);


        while (counter <= 10) {
            System.out.print("Enter a number of Sales: ");
            number = input.nextInt();

            if (number > largestNumber) {
                largestNumber = number;
            }
            
            counter++;

        }
        System.out.println();
        System.out.printf("The Largest number of sales was: %d%n",largestNumber);
    }
}
