/**
 * Concrete decorator 2
 */

class GreetingsSender extends SenderDecorator{
    GreetingsSender(Sender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String txt) {
        super.send(greeting(txt));
    }

    private String greeting(String txt) {
        return "Dear sir!\n" + txt;
    }

}
