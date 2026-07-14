class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] index=new int[2];
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                if(nums[i]+nums[j]==target){
                    index[0]=i;
                    index[1]=j;
                    break;
                }
                }
            }
        }

        Arrays.sort(index);

        return index;
    }
}
