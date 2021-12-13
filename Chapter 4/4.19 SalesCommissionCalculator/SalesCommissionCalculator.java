import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {

        double finalSalary = 200;
        double commission = 0.09;

        int itemCode;
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Item Code: ");
            itemCode = input.nextInt();

            if (itemCode == -1) {
                break;
            }

            if (itemCode == 1) {
                finalSalary += (item1 * commission);
                System.out.printf("Adding %.2f to Salary. ", item1 * commission);
            } else if (itemCode == 2) {
                finalSalary += (item2 * commission);
                System.out.printf("Adding %.2f to Salary. ", item2 * commission);
            } else if (itemCode == 3) {
                finalSalary += (item3 * commission);
                System.out.printf("Adding %.2f to Salary. ", item3 * commission);
            } else if (itemCode == 4){
                finalSalary += (item4 * commission);
                System.out.printf("Adding %.2f to Salary. ", item4 * commission);
            } else {
                System.out.println("Item number is not in the database. No changes made to Salary");
            }

            System.out.printf("Salary so far: %.2f%n", finalSalary);
        }

        System.out.println();
        System.out.println(".: Final Salary :.");
        System.out.printf("$ %.2f%n", finalSalary);

    }
 }