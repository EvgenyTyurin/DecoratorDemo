/**
 * Concrete component
 */

class MessageSender implements Sender {
    @Override
    public void send(String txt) {
        System.out.println(txt);
    }
}
