import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Start
 */
public class Start {

  public static void main(String[] args) {
    // Create Array

    System.out.println("Initialize Student --------------------");
    var student1 = new Student(20, "Waleed", "A.K.");
    System.out.println("Display Student1 --------------------");
    System.out.println(student1);
    System.out.println("Display Student1 Json----------------");
    System.out.println(Json.toString(student1));

    System.out.println("Save Json-------------------------");
    Json.toFile(student1, "out/Student.json");
    System.out.println("Load Json-------------------------");
    var student2 = Json.fromFile("out/Student.json", Student.class);
    System.out.println("Display Student2 --------------------");
    System.out.println(student2);
    System.out.println("Display Student2 Json----------------");
    System.out.println(Json.toString(student2));

    List<Student> students1 = new ArrayList<Student>();
    students1.add(new Student(20, "Name8", "Last1"));
    students1.add(new Student(22, "Name2", "Last2"));
    students1.add(new Student(23, "Name7", "Last3"));
    students1.add(new Student(24, "Name4", "Last5"));
    students1.add(new Student(19, "Name1", "Last6"));
    System.out.println("Display Students1 Json----------------");
    System.out.println(Json.toString(students1));
    System.out.println("Save Json-------------------------");
    Json.toFile(students1, "out/Students.json");
    System.out.println("Load Json-------------------------");

    var students2 = Arrays.asList(Json.fromFile("out/Students.json", Student[].class));
    System.out.println(Json.toString(students2));

    var students3 = students2.stream().filter(c -> c.getAge() > 22).collect(Collectors.toList());
    System.out.println(Json.toString(students3));
    var students4 = students2.stream().sorted((a, b) -> a.getFirst().compareTo(b.getFirst()))
        .collect(Collectors.toList());
    System.out.println(Json.toString(students4));

    // arr6.toArray(Integer[]::new);
    // System.out.println("Display Json-------------------------");
    // System.out.println(Json.toString(arr6));

  }

}
