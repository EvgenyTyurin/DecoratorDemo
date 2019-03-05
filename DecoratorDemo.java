/**
 * Decorator pattern demo
 * Mar 2019 Evgeny Tyurin
 *
 * MessageSender sends messages, but with decorators we can easily add functions such as
 * add signing or/and greeting to message.
 */

public class DecoratorDemo {

    /** Run point */
    public static void main(String[] args) {
        SenderDecorator senderDecorator = new GreetingsSender(new SignSender(new MessageSender()));
        senderDecorator.send("Hello, world!");
    }

}
