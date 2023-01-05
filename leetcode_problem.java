package SEARCHING;

public class leetcode_problem {
    public static void main(String[] args) {
        int[] num = {12,345,20,6,7896}; // output = 2
        System.out.println(findnum(num));
    }
    static int findnum(int[] num){
        int count =0;
        for(int nums : num){
            if(even(nums)){
                count++;
            }
        }
        return  count;
    }
    static boolean even(int num){
        int digit = digit(num);
        if(digit % 2 == 0){
            return  true;
        }
        return  false;
    }
    static int digit(int num){
            int count = 0;
            while(num>0){
                count++;
                num = num / 10;
            }
            return  count;
    }
}
