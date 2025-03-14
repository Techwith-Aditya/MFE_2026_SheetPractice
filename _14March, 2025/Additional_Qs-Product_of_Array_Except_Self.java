class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
            {
                continue;
            }
            product=product*nums[i];
        }

        int[] ans=new int[nums.length];
        int zerocount=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
            {
                zerocount++;
            }
        }

        if(zerocount>1)
        {
            return ans;
        }

        if(zerocount==1)
        {
            for(int i=0; i<nums.length;i++)
            {
                if(nums[i]==0)
                {
                    ans[i]=product;
                    return ans;
                }
            }
        }

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=0)
            {
                ans[i]=product/nums[i];
            }
        }
        return ans;
    }
}
