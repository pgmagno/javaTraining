public class DateTest {
    public static void main(String[] args) {

        Date myDate = new Date(12, 23,2021);

        System.out.printf("Day is: %d%n", myDate.getDay());
        System.out.printf("Month is: %d%n", myDate.getMonth());
        System.out.printf("Year is: %d%n", myDate.getYear());

        myDate.displayDate();

        System.out.println("Changing information...");

        myDate.setDay(13);
        myDate.setMonth(5);
        myDate.setYear(1987);

        myDate.displayDate();
    }
}
