//can be record class (just a data carrier - IDE suggestion (will read about it))
public class AcquireUserInfo {
    private final int askCount;

    public AcquireUserInfo(int askCount) {
        this.askCount = askCount;
    }

    public int getAskCount() {
        return askCount;
    }

    public String getInitialMessage() {
        String initialMessage = "\nHello, please name some animals!";
        return initialMessage + " ("+askCount+")\n";
    }

    public String getEndMessage() {
        return "Thanks, now given data will be printed below!\n";
    }

    public String getQuestionMessage(int counter) {
        String questionMessage = "Name animal No.";
        return questionMessage + " ("+(counter+1)+")";
    }
}
