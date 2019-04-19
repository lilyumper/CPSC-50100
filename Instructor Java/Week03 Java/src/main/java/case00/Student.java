package case00;

/**
 * Student
 */
public class Student {

  private Integer age = 0;
  // set
  public void age(Integer value) {
    this.age = value;
  }
  // get
  public Integer getAge() {
    return this.age;
  }

  private String firstName = "";
  // set
  public void firstName(String value) {
    this.firstName = value;
  }
  // get
  public String getFirstName() {
    return this.firstName;
  }

  private String lastName = "";
  // set
  public void lastName(String value) {
    this.lastName = value;
  }
  // get
  public String getLastName() {
    return this.lastName;
  }

  // get
  public String getFullName() {
    return this.firstName + " "+this.lastName;
  }

}
