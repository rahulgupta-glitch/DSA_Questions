// class Solution {
//     public boolean isMonotonic(int[] nums) {
//         boolean increasing =true;
//         boolean decreasing =true;
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]>nums[i+1]){
//                 increasing=false;
//             }if(nums[i]<nums[i+1]){
//                 decreasing=false;
//             }

//         }
//         return increasing || decreasing;
//     }
// }
class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        //lets asume that the ans array is from 0 to positive number
        int check = 1;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]<0){
                check = 0;
                break;
            }
        }
        if(check == 1) return true;
        //if it comes here then it is decreasing
        for(int i =0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]>0){
                check = 1;
                break;
            }
        }
        if(check == 0) return true;
        // if it come here then its not monotonic
        return false;
    }
}