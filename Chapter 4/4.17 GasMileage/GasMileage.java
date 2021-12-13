import java.util.Scanner;

// Exercise 4.16: Mystery.java
public class GasMileage {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        double sentinel = 0;
        double miles = 0;
        double gallons = 0;
        double avgMileage = 0;
        double mileage = 0;
        int trips = 0;
        double totalMiles = 0;

        System.out.println("Insert Miles driven or -1 to finish");
        miles = input.nextDouble();
        sentinel = miles;

        while (sentinel != -1) {
            trips++;
            System.out.println("Insert gallons used");
            gallons = input.nextDouble();
            mileage = miles/gallons;

            System.out.println("Current trip mileage");
            System.out.printf("Miles driven: %.2f%n", miles);
            System.out.printf("Gallons used: %.2f%n", gallons);
            System.out.printf("Mileage: %.2f%n", mileage);
            totalMiles += miles;

            avgMileage = (avgMileage + mileage)/trips;


            System.out.println("Insert Miles driven or -1 to finish");
            miles = input.nextDouble();
            sentinel = miles;
        }

        System.out.printf("Total Miles: %.2f%n", totalMiles);
        System.out.printf("Total Trips: %d%n", trips);
        System.out.printf("Average Mileage: %.2f%n", avgMileage);

    }
 }