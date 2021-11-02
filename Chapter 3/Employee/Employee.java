public class Employee {

    //instance variables
    private String name;
    private String lastName;
    private double monthlySalary;

    //constructor class
    public Employee (String name,String lastName, double monthlySalary) {
        this.name = name;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    // SET methods

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    // GET methods

    public String getName () {
        return name;
    }

    public String getLastName () {
        return lastName;
    }

    public double getMonthlySalary () {
        return monthlySalary;
    }

    // More complex get method with formatting and yearly salary
    public void getInfo () {
        System.out.printf("Employee: %s %s%n",getName(),getLastName());
        System.out.printf("Monthly Salary: %.2f%nYearly: %.2f%n\n", getMonthlySalary(),getMonthlySalary()*12);

    }



}
