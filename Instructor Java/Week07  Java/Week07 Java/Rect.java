/**
 * Rect
 */
public class Rect extends Square {
  private int s2 = 0;

  public Rect(int x, int y, int s, int s2) {
    super(x, y, s);
    this.s2 = s2;
  }

  /**
   * @return the s2
   */
  public int getS2() {
    return s2;
  }

  /**
   * @param s2 the s2 to set
   */
  public void setS2(int s2) {
    this.s2 = s2;
  }

  @Override
  public double area() {
    return 1.0 * getS() * s2;
  }
}
