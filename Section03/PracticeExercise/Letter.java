package Section03.PracticeExercise;

/**
 * Letter class consist of sender name, recipient name, a simple letter.
 */
public class Letter {

    /**
     * Sender name of letter
     */
    private String senderName;

    /**
     * Recipient name of letter
     */
    private String recipientName;

    /**
     * Text from body of letter.
     */
    private String text;

    /**
     * Construct latter from sender name and recipient name.
     * @param from sender name.
     * @param to recipient name.
     */
    public Letter(String from, String to){
        this.senderName = from;
        this.recipientName = to;
        this.text = "";
    }

    /**
     * Add line of text to a body of letter.
     * @param line text of letter.
     */
    public void addLine(String line){
        this.text = text.concat(line);
    }

    /**
     * Text of letter
     * @return text of letter with form.
     */
    public String getText(){
        String header = "Dear, " + this.recipientName.concat("\n").concat("\n");
        String body = this.text;
        String footer = "\n" + "Sincerely, ".concat("\n").concat("\n").concat(this.senderName);
        return header + body + footer;
    }
}
