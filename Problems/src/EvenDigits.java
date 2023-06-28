// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
     int[] nums = {1,14,21,325,4137};
        System.out.println(findNumber(nums));
    }
    // To iterate for every number n array.
    static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    // To check if no of digits are even or not.
    static boolean even(int num){
        int numberOfDigits = digits2(num);
        /*if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
        */
        return numberOfDigits % 2 == 0;

    }
    // To count no. of digits
    static int digits (int num) {
        if (num<0){
            num = num*-1;                 //In case num is negative. We will make it positive
        }
        int count=0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
    static int digits2 (int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num) +1);
    }


}
