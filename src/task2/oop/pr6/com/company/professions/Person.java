package task2.oop.pr6.com.company.professions;

public class Person {
    protected String FIO;
    protected int age;

    public Person() {
    }

    public Person(String FIO, int age) {
        this.FIO = FIO;
        this.age = age;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FIO='" + FIO + '\'' +
                ", age=" + age +
                '}';
    }
}
