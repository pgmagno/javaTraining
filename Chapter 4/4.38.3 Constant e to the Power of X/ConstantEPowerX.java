import java.util.Scanner;

public class ConstantEPowerX {
    public static void main(String[] args) {

        double valueOfE = 0;
        int exponent = -1;
        int count = 1;
        double total;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the power number to calculate the value of Constant 'e': ");

        while (exponent < 0) {
            exponent = input.nextInt();
        }

        double factorial;
        int count2 = exponent;

        while (count <= exponent) {
            factorial = count2; //resetting factorial to current negative count
            total = 1;         //resetting total

            while (factorial >= 1) {
                total *= factorial;
                factorial--;
            }
            factorial = count2;

            valueOfE += Math.pow(exponent, factorial) / total;

            count++;
            count2--;
        }
        System.out.printf("The value of Constant 'e' to the power of %d is: %.5f", exponent, valueOfE);

    }
}