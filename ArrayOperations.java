class Solution {
    public int[] applyOperations(int[] nums) {
        
        
        for(int i=0; i<nums.length-1; i++){
            
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
            
        }
        
        for(int i=0; i<nums.length; i++){
             
        for(int j=1; j<nums.length; j++){
            if(nums[j-1]==0 && nums[j]!=0){
                int temp=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
            }
        }
    }
        
        return nums;
        
    }
}