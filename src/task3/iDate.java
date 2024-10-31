package task3;

public class iDate implements iTriad {
    private int day;
    private int month;
    private int year;
    
    public iDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public void increment() {
        day++; 
        if (day > 30) { 
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    @Override
    public void printValue() {
        System.out.printf("Date: %02d-%02d-%d%n", day, month, year);
    }
}
