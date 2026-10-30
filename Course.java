import java.util.ArrayList;
import java.util.List;
public class Course {
    private String courseCode;
    private String courseName;
    private Professor instructor;
    private List<Student> enrolledStudents;
    public Course(String courseCode,String courseName)
    {
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.enrolledStudents=new ArrayList<>();
    }
    public void assignInstructor(Professor instructor)
    {
        this.instructor = instructor;
        System.out.println(instructor.getName() + " has been assigned to teach " + courseName);
    }
    public void enrollStudent(Student student)
    {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " has been enrolled in " + courseName);
    }
    public void enrolledStudent()
    {
        System.out.println("--- Roster for " + courseName + " ---");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName() + " (ID: " + student.getId() + ")");
        }
    }
}
