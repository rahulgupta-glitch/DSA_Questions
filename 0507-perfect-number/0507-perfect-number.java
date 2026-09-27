class Solution {
    public boolean checkPerfectNumber(int num) {
        if(divisor(num)==num) return true;
        else return false;
        
    }
    public static int divisor(int num){
        int sum=0;
        int i=1;
        while(i<=num/2){
            if(num%i==0){
                sum+=i;
            }
            i++;
        }
        return sum;
    }

}