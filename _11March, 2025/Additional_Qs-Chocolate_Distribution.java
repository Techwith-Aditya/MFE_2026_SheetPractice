class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr);
        int min=Integer.MAX_VALUE;
        
        for(int i=0; i<arr.size()-m+1; i++)
        {
             min=Math.min(min, arr.get(m-1+i)-arr.get(i));
        }
        return min;
    }
}
