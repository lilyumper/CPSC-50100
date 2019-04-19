package case01;
/**
 * C01HelloWorldRunner
 */
public class HelloWorldRunner implements Runnable {

    public void run() {
        var sample = new HelloWorld();
        sample.printHelloWorld();
        sample.printHelloWorld2();
        sample.printHelloWithInput("Waleed A.K.");
        sample.printHelloHandleField();
        sample.name("Waleed A.K.");
        sample.printHelloHandleField();
    }
}