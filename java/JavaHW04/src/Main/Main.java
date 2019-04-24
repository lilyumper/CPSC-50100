package Main;

public class Main {

    public static void main(String[] args) {
        double[] sampleArray = {22.25,22,25.15};
        double[] sampleArray2 = {1.2,2.5,3.5,4.5,6.0,1.22,5.15};

        findMean(sampleArray);
        std(sampleArray2);

    }

    public static double findMean(double[] x) {

        double sum =0;
        int count =0;
        double avg;

        for (double z : x) {
            sum += z;
            count +=1;
        }
        avg = (sum/count);
        System.out.println(("Mean: "+ avg));
         return(avg);



    }

    public static double std(double[] array) {
        double mean = findMean(array);
        double result;
        double sum =0;
        int length = array.length;
        double standardDeviation;

        for (double z: array) {
            result = Math.pow((z - mean),2);
            sum += result;
            System.out.println("result: " + result);
            System.out.println("sum: " + sum);

        }
        standardDeviation = Math.sqrt(sum/length-1);

        System.out.println("Standard Dev: "+ standardDeviation);
        return (standardDeviation);


    }
}
