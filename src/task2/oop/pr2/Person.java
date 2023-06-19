package task2.oop.pr2;

public class Person {
    private String fullName;
    private Long age;

    public void move(){
        System.out.println( fullName + "talks");
    }

    public void talk(){
        System.out.println( fullName + "talks");
    }

    public Person() {
    }

    public Person(String fullName, Long age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}


