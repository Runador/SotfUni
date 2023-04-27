package objectsAndClassesLab.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String studentData = scanner.nextLine();

        while (!studentData.equals("end")) {

            String firstName = studentData.split(" ")[0];
            String secondName = studentData.split(" ")[1];
            int age = Integer.parseInt(studentData.split(" ")[2]);
            String hometown = studentData.split(" ")[3];

            Student student = new Student(firstName, secondName, age, hometown);
            students.add(student);

            studentData = scanner.nextLine();

        }

        String city = scanner.nextLine();
        //"{firstName} {lastName} is {age} years old".

        for (Student student : students) {
            if (city.equals(student.getHometown())) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(),
                        student.getLastName(), student.getAge());
            }
        }

    }
}
