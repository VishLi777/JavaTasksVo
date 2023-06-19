package task1.modifaccess;

public class AccessExample {


    public String test;
    int d;
    private int keyNum;
    protected int accountId;


    public void functionTest(String test){
        this.test = test;
        test = "Test public";
        System.out.println(test);
    };

    private void functionTest1(int keyNum){
        keyNum=1;
        System.out.println(keyNum);
    };

    protected void functionTest2(int accountId){
        accountId=777;
        System.out.println(accountId);
    };

    public static void main(String[] args) {
        String t;
        AccessExample acex = new AccessExample();
        System.out.println(acex.accountId);
        System.out.println(acex.keyNum);
        System.out.println(acex.d);
        System.out.println(acex.test);
        acex.functionTest(acex.test);
//        System.out.println(acex3.functionTest2(acex3.accountId)););


    }

}
