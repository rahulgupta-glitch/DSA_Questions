class Solution {
    public boolean isPalindrome(int x) {
        int y=0;
        int temp=x;
        if(x<0) return false;
        while(x!=0){
            int digit=x%10;
            y=y*10+digit;
            x/=10;
        }
        return (y==temp);
    }
}