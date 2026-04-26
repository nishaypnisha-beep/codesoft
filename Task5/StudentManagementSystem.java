import java.util.ArrayList;

public class StudentManagementSystem {

    // list to store student objects
    private ArrayList<Student> students = new ArrayList<>();

    // method to add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully");
    }

    // method to remove student using roll number
    public void removeStudent(int rollNumber) {

        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNumber() == rollNumber) {
                students.remove(i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student removed successfully");
        } else {
            System.out.println("Student not found");
        }
    }

    // method to search student
    public void searchStudent(int rollNumber) {

        boolean found = false;

        for (Student s : students) {
            if (s.getRollNumber() == rollNumber) {
                s.displayStudent();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }
    }

    // method to display all students
    public void displayAllStudents() {

        if (students.size() == 0) {
            System.out.println("No students available");
            return;
        }

        System.out.println("\n--- Student List ---");

        for (Student s : students) {
            s.displayStudent();
        }
    }
}