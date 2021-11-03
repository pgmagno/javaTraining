import java.util.Calendar;

public class HeartRates {
    // This class contains all the necessary information to find the
    // ideal  heart rate of a person based on their information

    private String name;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    //Constructor
    public HeartRates (String name, String lastName, int dayOfBirth, int monthOfBirth,
                       int yearOfBirth) {

        this.name = name;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;

    }

    // SET methods

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    //GET Methods

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    // Person's Age Method
    public int calcAge () {
        Calendar cal = Calendar.getInstance(); //creates a calendar object to extract current year
        return cal.get(Calendar.YEAR) - yearOfBirth;
    }

    // Maximum heart Rate
    public int calcMaxHeartRate (int age) {
        return 220 - age;
    }

    // Target heart Rate
    public String calcTargetHeartRate (int maxHeartRate) {
        int minTargetRate = (int)(maxHeartRate * 0.5);
        int maxTargetRate = (int)(maxHeartRate * 0.85);

        return minTargetRate + "-" + maxTargetRate;
    }

    public void displayInfo () {
        System.out.printf("Name: %s %s%n",getName(), getLastName());
        System.out.printf("Date of birth: %d/%d/%d%n",getDayOfBirth(),getMonthOfBirth(),getYearOfBirth());
        System.out.printf("Age: %d%n", calcAge());
        System.out.printf("Max Heart Rate: %d%n", calcMaxHeartRate(calcAge()));
        System.out.printf("Target Heart Rate: %s%n", calcTargetHeartRate(calcMaxHeartRate(calcAge())));
    }

}
