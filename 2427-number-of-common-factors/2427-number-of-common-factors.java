class Solution {
    public int commonFactors(int a, int b) {
        int gcd=HCF(a,b);
        int count=0;
        for(int i=1; i<=gcd;i++){
            if(gcd%i==0) count++;
        }
        return count;
        
    }
    private int HCF(int a, int b){
        while(a!=b){
             if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }
}