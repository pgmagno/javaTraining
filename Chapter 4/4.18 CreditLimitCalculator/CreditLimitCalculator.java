import java.util.Scanner;

// Exercise 4.16: Mystery.java
public class CreditLimitCalculator {
    public static void main(String[] args) {

        int accountNumber = 0;
        int currentBalance = 0;
        int totalItemsCharged = 0;
        int totalCreditsApplied = 0;
        int allowedCredit = 0;
        int updatedBalance = 0;
        int customersWithinBalanceLimits = 0;
        int customersAboveLimits = 0;

        Scanner input = new Scanner(System.in);


        while(true) {

            System.out.print("Enter Account Number or -1 to EXIT: ");
            accountNumber = input.nextInt();
            if (accountNumber == -1) {
                break;
            }
            System.out.print("Enter Current Balance: ");
            currentBalance = input.nextInt();
            System.out.print("Enter the total of Items Charged: ");
            totalItemsCharged = input.nextInt();
            System.out.print("Enter the total of Credits Applied: ");
            totalCreditsApplied = input.nextInt();
            System.out.print("Enter the Allowed Credit: ");
            allowedCredit = input.nextInt();

            updatedBalance = currentBalance + totalItemsCharged - totalCreditsApplied;

            System.out.printf(".: Account Number: %d :. %n", accountNumber);
            if (allowedCredit <= updatedBalance) {
                System.out.println("Status: Total Limit Exceeded");
                customersAboveLimits++;
            } else {
                System.out.printf("Status: OK. Remaining Credits: %d%n", allowedCredit - updatedBalance);
                customersWithinBalanceLimits++;
            }

        }
        System.out.println();
        System.out.println("End of Query");
        if (customersAboveLimits == 0 && customersWithinBalanceLimits == 0 ) {
            System.out.println("No searches were performed");
        } else {
            System.out.printf("Number of Customers within credit limit: %d%n", customersWithinBalanceLimits);
            System.out.printf("Number of Customers above credit limit: %d%n", customersAboveLimits);
        }

    }
 }