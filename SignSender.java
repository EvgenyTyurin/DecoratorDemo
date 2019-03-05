/**
 * Concrete decorator 1
 */

class SignSender extends SenderDecorator {
    SignSender(Sender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String txt) {
        super.send(sign(txt));
    }

    private String sign(String txt) {
        return txt + "\nSincerely yours, Mister X";
    }

}
