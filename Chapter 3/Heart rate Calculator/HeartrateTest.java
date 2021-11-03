import java.util.Scanner;

public class HeartrateTest {
    public static void main(String[] args) {

        System.out.println("An example of this class can be seen below:");

        HeartRates myHeartRate = new HeartRates("Paulo", "Magno", 8,5,1987);
        myHeartRate.displayInfo();

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("♥ HEART RATE CALCULATOR ♥");
        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("What is your last name?");
        String lastName = input.nextLine();

        System.out.println("What is your day of birth?");
        int dayOfBirth = input.nextInt();

        System.out.println("What is your month of birth?");
        int monthOfBirth = input.nextInt();

        System.out.println("What is your year of birth?");
        int yearOfBirth  = input.nextInt();

        HeartRates newUser = new HeartRates(name,lastName,dayOfBirth,monthOfBirth,yearOfBirth);

        newUser.displayInfo();

    }
}
