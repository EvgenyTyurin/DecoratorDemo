/**
 * Decorator
 */

class SenderDecorator implements Sender {
    private Sender messageSender;

    SenderDecorator(Sender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    public void send(String txt) {
        messageSender.send(txt);
    }
}
