import java.util.Scanner;

public class ConstantE {
    public static void main (String[] args) {

        double valueOfE = 0;
        int terms = -1;
        int count = 1;
        double total = 1;


     Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms to calculate the value of Constant 'e': ");

        while (terms < 0) {
           terms = input.nextInt();
        }

       double factorial;
       int count2 = terms;

        while (count <= terms) {
            factorial = count2; //resetting factorial
            total = 1;         //resetting total

            while (factorial >= 1) {
                total *= factorial;
                factorial--;
            }

            valueOfE += 1/total;

            count++;
            count2--;
        }
        valueOfE += 1;
        System.out.printf("The value of Constant 'e' with %d term(s) is: %.5f", terms, valueOfE);

    }
}
