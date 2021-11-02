public class Date {
    private int month;
    private int day;
    private int year;

    public Date (int month, int day, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //SET methods

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // GET methods

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // DISPLAY DATE

    public void displayDate () {
        System.out.printf("Full date is: %d / %d / %d%n",getDay(),getMonth(),getYear());
        System.out.println();
    }

}
