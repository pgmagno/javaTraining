import java.util.Calendar;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private double height;
    private double weight;

    public HealthProfile (String firstName, String lastName, String gender, int dayOfBirth,
            int monthOfBirth, int yearOfBirth, double height, double weight) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }

    // GET methods

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // GET Methods

    public String getFirstName() {
        return firstName;
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

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }

    // Age
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

    public double calcBMI () {
        return (weight*703)/(height*height);
    }


    public String displayBMIresult (HealthProfile profile) {
        double BMI = profile.calcBMI();

        if (BMI < 18.5) {
            return "Underweight";
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            return "Normal Weight";
        } else if (BMI > 24.9 && BMI < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public void displayInfo (HealthProfile profile) {
        System.out.printf("Subject: %s %s%n", profile.getFirstName(), profile.getLastName());
        System.out.printf("Birthdate: %d/%d/%d%n", profile.getDayOfBirth(),profile.getMonthOfBirth(), profile.getYearOfBirth());
        System.out.printf("Age: %d years old%n", profile.calcAge());
        System.out.printf("Maximum Heart Rate: %d%n", profile.calcMaxHeartRate(profile.calcAge()));
        System.out.printf("Target Heart Rate range: %s%n", profile.calcTargetHeartRate(profile.calcMaxHeartRate(profile.calcAge())));
        System.out.printf("Height: %.2f%n", profile.getHeight());
        System.out.printf("Weight: %.2f%n", profile.getWeight());
        System.out.printf("Body Mass Index: %.2f - %s %n", profile.calcBMI(), profile.displayBMIresult(profile));
        System.out.println("""
                BMI Categories:
                        Underweight = <18.5
                        Normal weight = 18.5–24.9
                        Overweight = 25–29.9
                        Obesity = BMI of 30 or greater
                """);
    }
}
