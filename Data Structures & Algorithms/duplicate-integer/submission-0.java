class Solution {
    public boolean hasDuplicate(int[] nums) {

        int isTrue=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i!=j){
                    isTrue=1;
                    break;
                }
            }
        }

        if(isTrue==0){
            return false;
        }
        else{
            return true;
        }
    }
}