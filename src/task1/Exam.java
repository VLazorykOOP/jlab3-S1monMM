package task1;

public class Exam extends Test {
    private String examDate;

    public Exam(String subject, int maxScore, String examDate) {
        super(subject, maxScore);
        this.examDate = examDate;
    }

    public void conductTest() {
        System.out.println("Conducting exam for " + subject + " on " + examDate);
    }
}
