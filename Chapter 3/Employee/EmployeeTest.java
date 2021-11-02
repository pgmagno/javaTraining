public class EmployeeTest {

    public static void main(String[] args) {

        // Creates two objects of Employee
        Employee worker1 = new Employee("Paulo", "Magno", 100_000);
        Employee worker2 = new Employee("John", "Doe", 10000);

        // printing info of both employees
        worker1.getInfo();
        worker2.getInfo();

        // raising their salaries by 10%
        worker1.setMonthlySalary(worker1.getMonthlySalary()*1.10);
        worker2.setMonthlySalary(worker2.getMonthlySalary()*1.10);

        System.out.println("Each employee gets a 10% raise");

        // show new info of employees
        worker1.getInfo();
        worker2.getInfo();
    }
}
