import task1.*;
import task2.*;
import task3.*;

public class Main { 
  public static void main(String[] args) {
    Exam exam = new Exam("Mathematics", 100, "2024-05-15");
        GraduationExam graduationExam = new GraduationExam("Physics", 100, "2024-06-15");
        Trial trial = new Trial("Chemistry", 50, "Practical");

        exam.conductTest();
        graduationExam.conductTest();
        trial.conductTest();
    
    Date date = new Date(30, 12, 2023);
    Time time = new Time(23, 59, 59);

    date.printValue();
    time.printValue();

    date.increment();
    time.increment();

    date.printValue();
    time.printValue();


    iDate idate = new iDate(30, 12, 2023);
    iTime itime = new iTime(23, 59, 59);

    idate.printValue();
    itime.printValue();

    idate.increment();
    itime.increment();

    idate.printValue();
    itime.printValue();
  } 
}
