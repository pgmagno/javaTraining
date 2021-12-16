public class MultiplesOfTwoWithInfiniteLoop {
    public static void main (String[] args) {

        int count = 0;
        int number = 1;
        while (count < 1) {
            number *= 2;
            System.out.println(number);
        }
//        What happens: the last valid number, probably maximum for the size of int is 1073741824, then suddenly this
  // negative number -2147483648, and then zeros.
    }
}
