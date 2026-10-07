class Solution {
    public int thirdMax(int[] nums) {
        long f1=Long.MIN_VALUE;;
        long f2=Long.MIN_VALUE;
        long f3=Long.MIN_VALUE;
        for(int num:nums){
            if(num>f1){
                f3=f2;
                f2=f1;
                f1=num;
            }else if(f1>num && num>f2){
                f3=f2;
                f2=num;
            }else if(f2>num && num>f3){
                f3=num;
            }
        }
        return f3 !=Long.MIN_VALUE ?(int) f3:(int) f1; 
    }
}