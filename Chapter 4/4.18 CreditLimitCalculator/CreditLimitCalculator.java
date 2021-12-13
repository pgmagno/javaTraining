import java.util.Scanner;

// Exercise 4.16: Mystery.java
public class CreditLimitCalculator {
    public static void main(String[] args) {

        int accountNumber = 0;
        int currentBalance = 0;
        int totalItemsCharged = 0;
        int totalCreditsApllied = 0;
        int allowedCredit = 0;
        int updatedBalance = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNumber = input.nextInt();
        System.out.print("Enter Current Balance: ");
        currentBalance = input.nextInt();
        System.out.print("Enter the total of Items Charged: ");
        totalItemsCharged = input.nextInt();
        System.out.print("Enter the total of Credits Applied: ");
        totalCreditsApllied = input.nextInt();
        System.out.print("Enter the Allowed Credit: ");
        allowedCredit = input.nextInt();

        updatedBalance = currentBalance + totalItemsCharged - totalCreditsApllied;

        System.out.printf(".: Account Number: %d :. %n", accountNumber);
        if (allowedCredit <= updatedBalance) {
            System.out.println("Status: Total Limit Exceeded");
        } else {
            System.out.printf("Status: OK. Remaining Credits: %d%n", allowedCredit - updatedBalance);
        }

    }
 }