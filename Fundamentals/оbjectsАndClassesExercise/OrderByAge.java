package оbjectsАndClassesExercise;

import java.util.*;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentData = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        while (!studentData.equals("End")) {

            String name = studentData.split(" ")[0];
            String id = studentData.split(" ")[1];
            int age = Integer.parseInt(studentData.split(" ")[2]);

            Student student = new Student(name, id, age);
            students.add(student);
            studentData = scanner.nextLine();

        }

        students.sort(Comparator.comparingInt(Student::getAge));

        for (Student student : students) {
            System.out.print(student);
        }
    }

}

class Student {

    private String name;
    private String id;
    private int age;

    public Student(String name, String id, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        //Stephan with ID: 524244 is 10 years old.
        return String.format("%s with ID: %s is %d years old.%n", getName(), getId(), getAge());
    }

}
