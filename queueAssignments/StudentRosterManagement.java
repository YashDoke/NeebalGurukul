package queueAssignments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private ArrayList<Course> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }

    public void displayCourses() {
        System.out.println("Enrolled courses for " + name + " (ID: " + id + "):");
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

class Course {
    private int courseId;
    private String courseName;
    private String semester;

    public Course(int courseId, String courseName, String semester) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Course Name: " + courseName + ", Semester: " + semester;
    }
}

public class StudentRosterManagement {
    public static void main(String[] args) {
        ArrayList<Student> roster = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Roster Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Enroll Student in a Course");
            System.out.println("3. Display the list of courses a student is enrolled in");
            System.out.println("4. Display the list of all students in the roster along with their ID and enrolled courses");
            System.out.println("5. Remove Student from the list using the given ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();  
                    roster.add(new Student(studentName, studentId));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter student ID: ");
                    int enrollStudentId = scanner.nextInt();
                    scanner.nextLine();  
                    Student studentToEnroll = null;

                    for (Student student : roster) {
                        if (student.getId() == enrollStudentId) {
                            studentToEnroll = student;
                            break;
                        }
                    }

                    if (studentToEnroll == null) {
                        System.out.println("Student not found in the roster!");
                    } else {
                        System.out.print("Enter course ID: ");
                        int courseId = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.print("Enter course name: ");
                        String courseName = scanner.nextLine();
                        System.out.print("Enter semester: ");
                        String semester = scanner.nextLine();

                        Course course = new Course(courseId, courseName, semester);
                        studentToEnroll.enrollCourse(course);
                        System.out.println("Student enrolled in the course successfully!");
                    }
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    int displayStudentId = scanner.nextInt();
                    scanner.nextLine();  
                    Student studentToDisplay = null;

                    for (Student student : roster) {
                        if (student.getId() == displayStudentId) {
                            studentToDisplay = student;
                            break;
                        }
                    }

                    if (studentToDisplay == null) {
                        System.out.println("Student not found in the roster!");
                    } else {
                        studentToDisplay.displayCourses();
                    }
                    break;

                case 4:
                    System.out.println("\nList of all students in the roster:");
                    for (Student student : roster) {
                        System.out.println(student);
                        student.displayCourses();
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.print("Enter student ID to remove: ");
                    int removeStudentId = scanner.nextInt();
                    scanner.nextLine();
                    Iterator<Student> iterator = roster.iterator();
                    boolean studentRemoved = false;

                    while (iterator.hasNext()) {
                        Student student = iterator.next();
                        if (student.getId() == removeStudentId) {
                            iterator.remove();
                            System.out.println("Student removed successfully!");
                            studentRemoved = true;
                            break;
                        }
                    }

                    if (!studentRemoved) {
                        System.out.println("Student not found in the roster!");
                    }
                    break;

                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
