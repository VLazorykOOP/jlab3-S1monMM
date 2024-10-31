package task1;

public class Exam extends Test {
    private String examDate;

    public Exam(String subject, int maxScore, String examDate) {
        super(subject, maxScore);
        this.examDate = examDate;
    }
    @Override
    public void conductTest() {
        super.conductTest();
        System.out.println(" on " + examDate);
    }
}
