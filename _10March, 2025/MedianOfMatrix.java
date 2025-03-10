import java.util.*;

public class Solution {
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        int n=A.size();
        int m=A.get(0).size();
        
        int low=Integer.MAX_VALUE, high=Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++)
        {
            low=Math.min(low, A.get(i).get(0));
            high=Math.max(high, A.get(i).get(m-1));
        }
        
        int req=(n*m)/2;
        
        while(low <= high)
        {
            int mid=(low+high)/2;
            int smallEqual=countSmallEqual(A, n, m, mid);
            
            if(smallEqual<=req)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        
        return low;
    }
    
    private int countSmallEqual(ArrayList<ArrayList<Integer>> matrix, int n, int m, int x) {
        int cnt=0;
        
        for(int i=0; i<n; i++)
        {
            cnt=cnt+upperBound(matrix.get(i), x, m);
        }
        
        return cnt;
    }
    
    private int upperBound(ArrayList<Integer> arr, int x, int n) {
        int low=0, high=n-1;
        int ans=n;
        
        while(low <= high)
        {
            int mid=(low+high)/2;
            
            if(arr.get(mid)>x)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        
        return ans;
    }
}
