// This app figures out if a 5-digit integer entered by the user is a palindrome

import java.util.Scanner;

public class Palindromes {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int originalNumber;
        int count;
        int number1;
        int number2;

        int number4;
        int number5;

        System.out.println("Enter a 5-digit number or -1 to exit");
        number = input.nextInt();
        originalNumber = number;

        // understanding the loop
//       count = 0  55555 /10 = 5555.5 = 5555 integer division drops the decimal part of the number (i.e. it truncates)
//       count = 1  5555  /10 = 555.55 = 555
//       count = 2  555   /10 = 55.555 = 55
//       count = 3  55    /10 = 5.5555 = 5
//       count = 4  5     /10 = 0.55555 = 0
//       count = 5  Condition is false at this point, so loop is not run, even if the number is not 0

        // the while loop will run while all conditions are true. if there is a conjunction (AND) in the logical expression
        //then all conditions must be true to run, else it will stop if at least one becomes false.

        //note: at one point I thought only the count variable was necessary, given that you might think that the by
        //simply counting to 5 we make sure the number becomes zero, and the count also becomes five, terminating the loop.
        // This produces an incorrect logic result: if the number has 3 digits, then it will become 0 and count will become 5
        // and this will incorrectly state that the number had 5 digits. If we impose a condition of !=0 then the loop
        // might stop earlier (count will be less than 5, and the following IF will not execute), or it will continue until 5 and stop.
        // In this case, !=0 might still be true, meaning that the loop terminated
        //because of count but the number had not actually become 0, which then must mean it had more than 6 digits.
        // We test for this case in the IF condition after the loop. In the end, the use of count is two-fold: making sure
        // we stop dividing unnecessarily past the count of 5 and also counting the number of times the loop had to run in order for the divisions
        // to make the number become 0


        while (number != -1) {

            count = 0;
            while (number != 0 && count < 5) { // the loop will stop when count becomes 5 or number becomes 0
                number /= 10;                  // if it becomes 0 before the count (i.e. a 1 or 2 or 3 or 4-digit number),
                count++;                        // we continue until 5 and test below
                                               // to see it's a 5digit number. As we want ONLY 5-digit numbers, it's unnecessary
            }                                  // to keep loop past the count of 5.
            if (number == 0 && count == 5) {  // to be 5digits we need Number to have become 0 AND count be 5
                number = originalNumber;      // else, the loop was must have been interrupted in the maximum number of
                                                // count and the successive divisions were unable to provide a 0 before that
                                                // which means that number must have had originally more than 5 digits, thus invalid.
                System.out.print("It's a 5-digit number");

                number1 = number/10000;    // in integer division, the remainder is truncated. In 12345/10000 = 1
                number2 = (number%10000)/1000; // Using Modulus, we get the remainder of 12345/10000  which is 2345, so 2345/1000 = 2
                number4 = (number%100)/10;  // the remainder of 12345/100 is 45, so 45/10 = 4
                number5 = (number%10); // the remainder of 12345/10 is 5. We skip the middle number because it's irrelevant
                                        // when looking for palindromes of 5 digits. It will not be used in the logic below

                if (number1 == number5 && number2 == number4) { // the only necessary test to figure a 5digit palindrome
                    System.out.println(" and it's a palindrome! 😀");
                } else {
                    System.out.println(", but it's NOT a palindrome. ☹");
                }

            } else {
                System.out.println("It's NOT a 5-digit number.");
            }
            System.out.println();
            System.out.println("Enter a 5-digit number or -1 to exit");
            number = input.nextInt();
            originalNumber = number;
        }




    }
}
//
