class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        //Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int diff=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=diff){
                return false;
            }
        }
        return true;
    }
}