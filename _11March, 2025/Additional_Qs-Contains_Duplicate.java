// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashSet<Integer> h=new HashSet<>();
//         for(int i=0; i<nums.length; i++)
//         {
//             if(h.contains(nums[i]))
//             {
//                 return true;
//             }
//             h.add(nums[i]);
//         }
//         return false;
//     }
// }

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
        return false;
    }
}
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashMap<Integer, Integer> h=new HashMap<>();
//         for(int i=0; i<nums.length; i++)
//         {
//             if(h.containsKey(nums[i]))
//             {
//                 return true;
//             }
//             else
//             {
//                 h.put(nums[i], nums[i]);
//             }
//         }
//         return false;
//     }
// }
