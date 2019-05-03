/**
 * Point
 */
public class Point {

  private int x = 0;
  private int y = 0;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * @return the x
   */
  public int getX() {
    return x;
  }

  /**
   * @param x the x to set
   */
  public void setX(int x) {
    this.x = x;
  }

  /**
   * @return the y
   */
  public int getY() {
    return y;
  }

  /**
   * @param y the y to set
   */
  public void setY(int y) {
    this.y = y;
  }

  public double area() {
    return 0.0;
  }

  @Override
  public String toString() {
    return String.format("(%d,%d)", x, y);
  }
}
