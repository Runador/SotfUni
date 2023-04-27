package objectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Student {

        private String firstName;
        private String lastName;
        private int age;
        private String city;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCity() {
            return city;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] studentData = input.split(" ");

            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String city = studentData[3];

            Student student = new Student();

            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setCity(city);

            students.add(student);

            input = scanner.nextLine();
        }

        String inputCity = scanner.nextLine();

        for (Student student : students) {
            if (inputCity.equals(student.getCity())) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(),
                        student.getAge());
            }

        }



    }
}

// If you receive a student who already exists (first name and last name should be unique),
// overwrite the information.