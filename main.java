import java.util.Scanner;
public class main {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // We set up one course to add students into
        Course dataStructure = new Course("CS201", "Data Structures and Algorithms");
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n--- University System Menu ---");
            System.out.println("1. Enroll a New Student");
            System.out.println("2. View Course Roster");
            System.out.println("3. Exit System");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // This consumes the invisible "Enter" key press so it doesn't skip the next input

            if (choice == 1) {
                System.out.print("Enter Student ID: ");
                String id = scanner.nextLine();
                
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter Age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume Enter key
                
                System.out.print("Enter Major: ");
                String major = scanner.nextLine();
                
                System.out.print("Enter Grade (out of 100): ");
                double grade = scanner.nextDouble();
                
                // Create the student using the typed data and add them to the course
                Student newStudent = new Student(id, name, age, major, grade);
                dataStructure.enrollStudent(newStudent);
                
            } else if (choice == 2) {
                dataStructure.enrolledStudent();
            } else if (choice == 3) {
                isRunning = false;
                System.out.println("Shutting down University System...");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
    }