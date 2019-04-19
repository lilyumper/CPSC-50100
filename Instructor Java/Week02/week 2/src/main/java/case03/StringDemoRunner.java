package case03;

/**
 * StringDemoRunner
 */
public class StringDemoRunner implements Runnable {

    public void run() {

        var sample = new StringDemo();
        sample.charArrayToString();
        sample.formatString();
        sample.stringConcat();
        sample.stringLength();
        sample.stringMethods();
    }

}