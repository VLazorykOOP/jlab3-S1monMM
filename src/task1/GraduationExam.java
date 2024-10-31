package task1;

public class GraduationExam extends Test {
    private String graduationDate;

    public GraduationExam(String subject, int maxScore, String graduationDate) {
        super(subject, maxScore);
        this.graduationDate = graduationDate;
    }

    public void conductTest() {
        System.out.println("Conducting graduation exam for " +  subject + " on " + graduationDate);
    }
}
