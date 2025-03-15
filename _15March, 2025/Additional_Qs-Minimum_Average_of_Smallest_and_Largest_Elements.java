class Solution {
    public double minimumAverage(int[] nums) {
        double[] ans=new double[nums.length/2];
        double finalAns=51;
        Arrays.sort(nums);
        for(int i=0; i<nums.length/2; i++)
        {
            double min=nums[i];
            double max=nums[nums.length-1-i];
            ans[i]=(min+max)/2;
            finalAns=Math.min(finalAns, ans[i]);
        }
        
        // double finalAns=51;
        // for(int i=0; i<ans.length; i++)
        // {
        //     if(finalAns>ans[i])
        //     {
        //         finalAns=ans[i];
        //     }
        // }

        return finalAns;
    }
}
