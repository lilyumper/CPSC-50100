/**
 * Start
 */
public class Start {

  public static void main(String[] args) {

    var p = new Point(3, 4);
    System.out.println(p);

    var c = new Circle(3, 4, 5);
    System.out.println(c);
    c.setY(10);
    System.out.println(c);
    System.out.printf("Circle Area=%f\n", c.area());

    var sq = new Square(4, 14, 20);
    System.out.println(sq);
    sq.setX(10);
    System.out.println(sq);
    System.out.printf("Square Area=%f\n", sq.area());

    var rect = new Rect(4, 14, 20, 3);
    System.out.println(rect);
    rect.setS(10);
    System.out.println(rect);
    System.out.printf("Square Area=%f\n", rect.area());

  }
}
