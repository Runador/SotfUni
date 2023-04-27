package оbjectsАndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    static class Person {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            String[] personInfo = scanner.nextLine().split(" ");
            String personName = personInfo[0];
            int personAge = Integer.parseInt(personInfo[1]);

            Person person = new Person(personName, personAge);
            people.add(person);

            if (person.age > 30) {
                System.out.printf("%s - %d%n", person.getName(), person.getAge());
            }
        }

    }

}
