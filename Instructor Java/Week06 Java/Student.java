/**
 * Student
 */
public class Student {

  int age = 0;
  String first = "";
  String last = "";

  public Student() {
  }

  public Student(int _age, String _first, String _last) {
    age = _age;
    last = _last;
    first = _first;
  }

  /**
   * @return the age
   */
  public int getAge() {
    return age;
  }

  /**
   * @param age the age to set
   */
  public void setAge(int age) {
    this.age = age;
  }

  /**
   * @return the first
   */
  public String getFirst() {
    return first;
  }

  /**
   * @param first the first to set
   */
  public void setFirst(String first) {
    this.first = first;
  }

  /**
   * @return the last
   */
  public String getLast() {
    return last;
  }

  /**
   * @param last the last to set
   */
  public void setLast(String last) {
    this.last = last;
  }

  /**
   * @return the full name
   */
  public String getFullName() {
    return first + " " + last;
  }

  @Override
  public String toString() {
    return String.format("[Age=%d, Full=%s]", age, getFullName());
  }

}
