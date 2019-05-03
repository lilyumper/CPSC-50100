/**
 * Square
 */
public class Square extends Point {

  private int s = 0;

  public Square(int x, int y, int s) {
    super(x, y);
    this.s = s;
  }

  /**
   * @return the s
   */
  public int getS() {
    return s;
  }

  /**
   * @param s the s to set
   */
  public void setS(int s) {
    this.s = s;
  }

  @Override
  public double area() {
    return 1.0 * s * s;
  }

  @Override
  public String toString() {
    return String.format("Side=%d LeftRight=(%d,%d)", s, getX(), getY());
  }
}
