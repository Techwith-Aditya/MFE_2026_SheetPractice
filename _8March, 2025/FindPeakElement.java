public class FindPeakElem {
    public static int findPeakElement(int[] nums) {
        int left=0; 
        int right=nums.length;;

        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(left==right)
            {
                return left;
            }
            else if(nums[mid]>nums[mid+1])
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums={1,2,1,3,5,6,4};
        int ans=findPeakElement(nums);
        System.out.println(ans);
    }
}
