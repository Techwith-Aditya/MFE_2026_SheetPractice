class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left=0;
        int right=nums.length-1;
        
        while(left<right)
        {
            int mid=left+(right-left)/2;
            // if we are are even index, then next odd index should contain same number. If we are at odd index, then we might have skipped the start of a pair, so we adjust mid to move back to the even index.
            if(mid%2==1) 
            {
                mid--;
            }
            
            if(nums[mid]==nums[mid+1])
            {
                left=mid+2;
            }
            else
            {
                right=mid; 
            }
        }
        return nums[left];
    }
}
