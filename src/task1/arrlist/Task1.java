package task1.arrlist;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args){

        ArrayList<Integer> nums = new ArrayList<Integer>(6);
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(4);
        nums.add(5);

        System.out.println("num-> " + nums);
        int t = function(nums);
        System.out.println("t -> " + t);

//        ArrayList<Integer> expectedNums = new ArrayList<Integer>(3);
//        int[] expectedNums = new int[nums.size()+1];


    }

    public static int function(ArrayList<Integer> nums){
        int k=0;
        for(int i = 0; i < nums.size(); i++) {
            System.out.println(i);
            k = i+1;
            System.out.println("k->" + k);
            for (int j = i + 1; j < nums.size(); j++) {

                if (nums.get(i) == nums.get(j)) {
                    System.out.println("Ok!");
                    nums.remove(i);
                    System.out.println(i);

                }
            }

            System.out.println("num-> " + nums.get(i));
            System.out.println("------");
//            System.out.println("expNum->" + expectedNums[i]);

        }
        System.out.println("k-> " + k);
        System.out.println("num-> " + nums);
        return k;
    }
}

