public class Main {

    public static void main(String[] args) {
        Monkey joey = new Monkey("Joey",45,62,true);
        joey.setColor("Yellow");

        System.out.println(joey.getHeight());
        System.out.println(joey.getWeight());
        System.out.println(joey.getColor());
        joey.climbTree();
        joey.eat();



    }
}
