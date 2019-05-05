public class Main {

    public static void main(String[] args) {
        diceRoll(100);

    }

    public static void diceRoll(int times) {
        int sum = 0;
        int ones = 0 ,twos = 0,threes = 0,fours = 0,fives = 0,sixes =0;


        for(int i =1; i <= times; i++) {
            int dice = (int) ((Math.random()*6) +1);
            sum+=dice;

            switch(dice) {
                case 1:
                    ones++;
                    break;

                case 2:
                    twos++;
                    break;

                case 3:
                    threes++;
                    break;

                case 4:
                    fours++;
                    break;

                case 5:
                    fives++;
                    break;

                case 6:
                    sixes++;
                    break;
            }
        }
        System.out.println("Sum of total rolls " + sum);
        System.out.println("Mean of total rolls " + (sum/times));
        System.out.println("How Many times were they Rolled");
        System.out.printf("ones: %d%n twos: %d%n threes: %d%n fours: %d%n fives: %d%n sixes: %d%n", ones, twos,
                threes, fours, fives, sixes);


    }

}
