package task1final;

public class FinalExample {
    public static void main(String[] args) {
        //initialization final fields
        final int FINAL_INTEGER_T=1;
//        //example final field error
//        FINAL_INTEGER_T=1;

        final int FINAL_INTEGER_CHANGE;
        FINAL_INTEGER_CHANGE=2;
//        //example final field error
//        FINAL_INTEGER_CHANGE=2;

        //example not final field
        int j;
        j=2;
        j=3;

        System.out.println("Final -> " + FINAL_INTEGER_CHANGE);
        System.out.println("Final -> "+ FINAL_INTEGER_T);
        System.out.println("NotFinal-> "+ j);
    }

    //example final method
    public final void changeValue( int FINAL_INTEGER_CHANGE, final int FINAL_INTEGER_T){
//        FINAL_INTEGER_CHANGE=3;
//        FINAL_INTEGER_T=5;
        System.out.println("Final field-> " + FINAL_INTEGER_CHANGE);
        System.out.println("Final field-> "+ FINAL_INTEGER_T);

    }
    //example not final method
    public void notFinalMethod(int j){

        System.out.println("NotFinal field-> " + j);

    }



}
