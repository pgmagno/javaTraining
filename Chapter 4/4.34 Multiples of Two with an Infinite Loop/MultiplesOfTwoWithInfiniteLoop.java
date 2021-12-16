public class MultiplesOfTwoWithInfiniteLoop {
    public static void main (String[] args) {

        int count = 0;
        int number = 1;
        while (count != 1) {
            number *= 2;
            System.out.println(number);
        }

    }
}
