public class TabularOutput {
    public static void main (String[] args) {

        int counter = 1;
        int tens = 10;
        int hundreds = 100;
        int thousands = 1000;
        String space = "     ";

        System.out.println("N     N*10   N*100   N*1000");

        while (counter <= 5) {
            System.out.println(counter + space +
                    (counter * tens) + space +
                    (counter * hundreds) + space +
                    (counter * thousands));
            counter++;
        }



    }
}
