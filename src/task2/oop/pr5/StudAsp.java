package task2.oop.pr5;

public class StudAsp {

    public static void main(String[] args) {
        Student student = new Student("Lol", "L","2", 5);
        Student aspirant = new Aspirant("Lol", "L","2", 5, "w");
        Student[] students = {student, aspirant};
        for(Student st : students){
            System.out.println(st.getScholarship());
        }
    }
}
