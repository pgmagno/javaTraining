import java.util.Scanner;

public class HealthProfileTest {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What's your first name?");
        String firstName = input.nextLine();

        System.out.println("What's your last name?");
        String lastName = input.nextLine();

        System.out.println("What's your gender?");
        String gender = input.nextLine();

        System.out.println("What's the day of your birth?");
        int day = input.nextInt();

        System.out.println("What's the month of your birth?");
        int month = input.nextInt();

        System.out.println("What's the year of your birth?");
        int year = input.nextInt();

        System.out.println("What's your height in inches?");
        int height = input.nextInt();

        System.out.println("What's your weight in pounds?");
        int weight = input.nextInt();

        HealthProfile myProfile = new HealthProfile(firstName, lastName, gender,
                day, month, year, height, weight);

        myProfile.displayInfo(myProfile);

    }
}
