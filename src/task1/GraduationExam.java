package task1;

public class GraduationExam extends Test {
    private String graduationDate;

    public GraduationExam(String subject, int maxScore, String graduationDate) {
        super(subject, maxScore);
        this.graduationDate = graduationDate;
    }
    @Override
    public void conductTest() {
        super.conductTest();
        System.out.println(" on " + graduationDate);
    }
}
