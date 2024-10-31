package task1;

public class Test {
    protected String subject;
    protected int maxScore;

    public Test(String subject, int maxScore) {
        this.subject = subject;
        this.maxScore = maxScore;
    }
    public void conductTest() {
        System.out.print("Conducting trial for " + subject);
    }
}
