/**
 * Circle
 */
public class Circle extends Point {

  private int r = 0;

  public Circle(int x, int y, int r) {
    super(x, y);
    this.r = r;
  }

  /**
   * @return the r
   */
  public int getR() {
    return r;
  }

  /**
   * @param r the r to set
   */
  public void setR(int r) {
    this.r = r;
  }

  @Override
  public double area() {
    return Math.PI * r * r;
  }

  @Override
  public String toString() {
    return String.format("R=%d Center=(%d,%d)", r, this.getX(), this.getY());
  }

}
