public class nthRoot {
    public static int nthroot(int n, int m) {
        if(n==1) 
        {
            return m;
        }
        
        int left=1;
        int right=m;
        
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            double power=Math.pow(mid, n);
            
            if(power==m)
            {
                return mid;
            }
            else if(power>m)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n=4;
        int m=16;
        int ans=nthroot(n, m);
        System.out.println(ans);
    }
}
