import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        String employeeName;
        double hoursWorked;
        double hourlyRate;
        int maximumNumberOfNormalHours = 40;
        double afterHoursRate = 1.5;
        double grossSalary;
        int numberOfEmployees = 3;
        int count = 0;

        Scanner input = new Scanner(System.in);

        while (count <= numberOfEmployees) {
            System.out.println("Enter employee's name: ");
            employeeName = input.nextLine();
            System.out.println("Enter employee's number of hours worked: ");
            hoursWorked = input.nextDouble();
            System.out.println("Enter employee's hourly rate: ");
            hourlyRate = input.nextDouble();

            if (hoursWorked - maximumNumberOfNormalHours <= 0) {
                grossSalary = hoursWorked * hourlyRate;
            } else {
                grossSalary = maximumNumberOfNormalHours * hourlyRate;
                grossSalary += (hoursWorked - maximumNumberOfNormalHours) * afterHoursRate;
            }

            System.out.printf("Employee's Name: %s%n", employeeName);
            System.out.printf("Salary: %.2f%n", grossSalary);
            System.out.println();

            count++;
            input.nextLine();
        }
    }
}

