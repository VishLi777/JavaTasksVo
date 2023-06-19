package task1.modifaccess;

public class ClassExtends extends AccessExample{

    public void functionTest(String test){
        test = "Test";
        System.out.println(test);
    };

    private void functionTest1(int keyNum){
        keyNum=2;
        System.out.println(keyNum);
    };

    @Override
    protected void functionTest2(int accountId){
//        accountId=7;
        System.out.println("accid " + accountId);
    };


}
