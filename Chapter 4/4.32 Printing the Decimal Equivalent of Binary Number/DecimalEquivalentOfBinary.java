import java.util.Scanner;

public class DecimalEquivalentOfBinary {
    public static void main (String[] args) {

        int number;
        int originalNumber;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        originalNumber = number;
        int noOfDigits = 0;
        int digitX;
        int decimalNumber = 0;

        //counting digits
        // We loop until number equals 0, counting the times the loop had to run to make the condition false
        //this number represents the number of digits of the number inputted.

        while(number !=0) {
            number /= 10;
            noOfDigits++;
        }
        number = originalNumber; // resetting inputted numbers original value

        // Formula for extracting digits from integers right to left
        //                  (Number / 10 to power of N-1) % 10
        // where N is the position from right to left. First number is in position 1, so it makes N = 1, thus 1-1 equals 10º

        // Example: 1234
        // Integer division drops the remainder, so...
        //        number4 = (number / 10º) % 10; ---------> 1234 / 1 = 1234 => 1234 % 10 = remainder = "4" (123.4)
        //        number3 = (number / 10¹) % 10; ---------> 1234 / 10 = 123 => 123 % 10 => remainder = "3" (12.3)
        //        number2 = (number / 10²) % 10; ---------> 1234 / 100 = 12 => 12 % 10 => remainder  = "2" (1.2)
        //        number1 = (number / 10³) % 10; ---------> 1234/ 1000 =  1 => 1 % 10 => no division is done, so "1"

        // Using the formula, we extract all integers, right to left, and print them to the screen
        // this loop uses the exponent to control the number of times necessary to parse all integers.
        // From 0 to maximum exponent, we are able to extract all digits in any given number. With 4 digits, we
        // need 0, 1, 2 and 3. Conveniently, the usual numbers with use in loops. This is not necessary, but
        // it was used to be able to develop the algorithm.

        int exponent = 0;
        while (exponent < noOfDigits) {
            digitX = (int) ((number / Math.pow(10, exponent)) % 10); // Math.pow returns a double, so we need to cast back to Int
            System.out.println(digitX);
            exponent++;
        }

        //Using the same loop, this time we calculate the equivalent decimal number of a binary integer.
        // Line 60 takes the extract digit multiplies it with 1, 2, 4, 8, 16, 32 ... and adds the result
        // to decimalNumber. In the next time we loop, we extract the following number and add to the previous
        // result.
        // Example: 1101
        // (1 * 1) + (2 * 0) + (4 * 1) + (8 * 1) = 13

        exponent = 0;

        while (exponent < noOfDigits) {
            //extracting one digit, from right to left
            digitX = (int) ((number / Math.pow(10, exponent)) % 10);
            // calculating that digit * its positional value, then adding the result to decimalNumber
            decimalNumber += (digitX * Math.pow(2,exponent));
            exponent++;
        }
        System.out.println(decimalNumber);
    }
}
