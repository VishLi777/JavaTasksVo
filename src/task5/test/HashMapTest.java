package task5.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    static class Id{
        private String name;
        private String lastName;

        Id(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Id id = (Id) o;

            if (name != null ? !name.equals(id.name) : id.name != null) return false;
            return lastName != null ? lastName.equals(id.lastName) : id.lastName == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
            return result;
        }
    }

    static class Student{
        private Id id;
        private String city;
        private String groupName;

        Student(Id id, String city, String groupName) {
            this.id = id;
            this.city = city;
            this.groupName = groupName;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", city='" + city + '\'' +
                    ", groupName='" + groupName + '\'' +
                    '}';
        }
    }

    static Map<Id, Student> students = new HashMap<>();

    private static void fillStudents() {
        Id id = new Id("Dmitry", "Oslavskiy");
        Student dmitriy = new Student(id, "Vorkuta", "Q-154");
        students.put(id, dmitriy);
    }

    private static void getStudent() {
        Id id = new Id("Dmitry", "Oslavskiy");
        Student dmitriy = students.get(id);
        System.out.println(dmitriy);
    }

    public static void main(String[] args) {
        fillStudents();
        getStudent();
    }
}
