package Four.four.homeWork.two;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Student> studentHashSet = new HashSet<>();

        System.out.println("You are creating new studentHashSet! ");

        while (true) {
            System.out.print("Enter the full name: ");
            String fullName = scanner.nextLine();
            if ("end".equals(fullName)) {
                break;
            }
            System.out.print("Enter the group: ");
            String group = scanner.nextLine();
            if ("end".equals(group)) {
                break;
            }
            System.out.print("Enter the student id: ");
            String studentId = scanner.nextLine();
            if ("end".equals(studentId)) {
                break;
            }
            boolean check = true;
            for (Student student : studentHashSet) {
                if (student.getStudentId().equals(studentId)) {
                    System.out.println("We have this student");
                    check = false;
                }
            }
            if (!check) continue;
            Student student = new Student(fullName, group, studentId);
            studentHashSet.add(student);
            System.out.println("To finish enter \"end\"");
        }

        System.out.println("List of students: ");
        int i = 1;
        for (Student student : studentHashSet) {
            System.out.println(i + "." + student);
            i++;
        }

    }
}
