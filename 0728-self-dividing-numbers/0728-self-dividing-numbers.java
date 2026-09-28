class Solution {
    private boolean isSelfDividingNo(int i){
        int n=i;
        while(n>0){
            int digit=n%10;
            if(digit==0 || i%digit!=0){
                return false;
            }
            n/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDividingNo(i)==true) result.add(i);
        }
        return result;
    }
}