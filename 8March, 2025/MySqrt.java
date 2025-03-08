// BS Application:
class Solution {
    public int mySqrt(int x) {
        int left=1; 
        int right=x;
        int ans=0;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if((long)mid*mid<=x)
            {
                ans=mid;
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return ans;
    }
}

// My Noob solution:
// class Solution {
//     public int mySqrt(int x) {
//         if(x==0 || x==1)
//         {
//             return x;
//         }

//         for(int i=1; i<=x; i++)
//         {
//             if(i*i==x)
//             {
//                 return i;
//             }
//             else if(i*i>x)
//             {
//                 return i-1;
//             }
//         }
//         return -1;
//     }
// }
