public class Student extends person{
private String major;
private double grade;
public Student(String id,String name,int age,String major,double grade)
{
super(id, name, age);
this.major=major;
this.grade=grade;
}
public String getMajor()
{
    return major;
}
public void setMajor(String major)
{
    this.major=major;
}
public double getGrade()
{
    return grade;
}
public void setGrade(double grade)
{
    this.grade=grade;
}
@Override 
public void displayDetails()
{
   System.out.println("ID: " + getId());
   System.out.println("Name: " + getName());
   System.out.println("Age: " + getAge());
   System.out.println("Major: " + major);
   System.out.println("Grade: " + grade);
}
}
