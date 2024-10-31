package task1;

public class Trial extends Test {
    private String trialType;

    public Trial(String subject, int maxScore, String trialType) {
        super(subject, maxScore);
        this.trialType = trialType;
    }

    public void conductTest() {
        System.out.println("Conducting trial for " + subject + " of type " + trialType);
    }
}
