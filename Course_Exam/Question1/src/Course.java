public class Course {
    public String courseName;
    public String teacherName;

    public Course(String courseName, String teacherName) {
        this.courseName = courseName;
        this.teacherName = teacherName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        teacherName = teacherName;
    }

    public static void  getInfo(Course[] y) {
        int a = 0;
        for(Course  x : y) {

            System.out.printf("|%d|%40s|%40s|%n", ++a, x.getCourseName(), x.getTeacherName());

        }
    }
}
