class Solution {
    public boolean isHappy(int n) {
        Set<Integer> usedN=new HashSet<>();
        while(true){
            int sum=0;
            while(n>0){
                sum+=Math.pow(n%10,2.0);
                n/=10;
            }
            if(sum==1) return true;
            n=sum;
            if(usedN.contains(n)) return false;
            usedN.add(n);
        }
    }
}