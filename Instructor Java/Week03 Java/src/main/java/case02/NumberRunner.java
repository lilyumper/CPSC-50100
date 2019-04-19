package case02;
/**
 * C02NumberRunner
 */
public class NumberRunner implements Runnable{

    public void run() {
        var sample = new Number();
        sample.arithmeticOperators();
        sample.numericDataType();
        sample.demoInt(456,23);
        sample.demoDouble(456.44,7.22);
        sample.demoMix(456,7.55);
        sample.covertFromString("2.3");
    }
}