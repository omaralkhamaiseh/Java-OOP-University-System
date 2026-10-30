public class Professor extends person{
    private String department;
    private double salary;
    public Professor(String id,String name ,int age ,String deparment,double salary)
    {
        super(id, name, age);
        this.department=deparment;
        this.salary=salary;
    }
    public String getDepartment()
    {
        return department;
    }
    public void setDepartment(String department)
    {
        this.department=department;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    @Override 
    public void displayDetails()
    {
         System.out.println("Professor ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}
