package task3;

public class iTime implements iTriad{
    private int hour;
    private int minute;
    private int second;
    
    public iTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public void increment() {
        second++; 
        if (second >= 60) {
            second = 0;
            minute++; 
            if (minute >= 60) {
                minute = 0;
                hour++; 
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
    }

    @Override
    public void printValue() {
        System.out.printf("Time: %02d:%02d:%02d%n", hour, minute, second);
    }
}
