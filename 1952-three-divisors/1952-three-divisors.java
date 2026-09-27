class Solution {
    public boolean isThree(int n) {
        return ans(n)==3;
    }
    public static int ans(int n){
        int count =0;
        int i=1;
        while(n>=i){
            if(n%i==0){
                count++;
            }
            i++;
        }
        return count;
    }
}