import java.util.*;

public class Solution {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        if(n>m)
        {
            return kthElement(arr2, arr1, m, n, k);
        }
        
        int low=Math.max(k-m, 0), high=Math.min(k, n);
        int left=k;
        
        while(low<=high)
        {
            int mid1=(low+high)>>1;
            int mid2=left-mid1;
            
            int l1=Integer.MIN_VALUE, l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE, r2=Integer.MAX_VALUE;
            
            if(mid1<n) r1=arr1.get(mid1);
            if(mid2<m) r2=arr2.get(mid2);
            if(mid1>0) l1=arr1.get(mid1 - 1);
            if(mid2>0) l2=arr2.get(mid2 - 1);
            
            if(l1<=r2 && l2<=r1)
            {
                return Math.max(l1, l2);
            }
            else if(l1>r2)
            {
                high=mid1-1;
            }
            else
            {
                low=mid1+1;
            }
        }
        
        return 0;
    }
}


// import java.util.*;
// public class Solution {
//     public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
//         ArrayList<Integer> combined=new ArrayList<>();
        
//         for(int i=0; i<arr1.size(); i++)
//         {
//             combined.add(arr1.get(i));
//         }
//         for(int i=0; i<arr2.size(); i++)
//         {
//             combined.add(arr2.get(i));
//         }

//         Collections.sort(combined);
//         return combined.get(k-1);
//     }
// }
