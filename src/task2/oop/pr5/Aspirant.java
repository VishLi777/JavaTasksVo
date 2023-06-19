package task2.oop.pr5;

public class Aspirant extends Student{

    private String work;

//    @Override
//    public double getScholarship(double averageMark){
//        if(averageMark == 5.0)
//            return 200.0;
//        return 180.0;
//    }


    public Aspirant(String work) {
        this.work = work;
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    @Override
    public double getScholarship() {
        return averageMark == 5 ? 200 : 180;

    }

}
