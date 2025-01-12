public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Management System!");
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Welcome to the Student Management System!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Calculate Average Grade");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner, students);
                    break;
                case 2:
                    displayStudents(students);
                    break;
                case 3:
                    calculateAverageGrade(students);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addStudent(Scanner scanner, ArrayList<Student> students) {
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student grade: ");
        double grade = scanner.nextDouble();

        students.add(new Student(name, grade));
        System.out.println("Student added successfully!");
    }

    public static void displayStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        System.out.println("\nStudent Records:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade());
        }
    }

    public static void calculateAverageGrade(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students to calculate average.");
            return;
        }

        double total = 0;
        for (Student student : students) {
            total += student.getGrade();
        }

        double average = total / students.size();
        System.out.println("Average Grade: " + average);
    }
}

class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}
