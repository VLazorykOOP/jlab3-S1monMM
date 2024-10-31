package task1;

public class Trial extends Test {
    private String trialType;

    public Trial(String subject, int maxScore, String trialType) {
        super(subject, maxScore);
        this.trialType = trialType;
    }
    @Override
    public void conductTest() {
        super.conductTest();
        System.out.println(" of type " + trialType);
    }
}
