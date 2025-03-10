class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int totalElements=rows*cols;
        int reqSmalls=k-1;
        
        int start=matrix[0][0];
        int end=matrix[rows-1][cols-1];

        while(start<=end) 
        {
            int letmedian=start+(end-start)/2;
            int lesserElements=countSmallerOrEqual(matrix, letmedian);

            if(lesserElements <= reqSmalls) 
            {
                start=letmedian+1;
            } 
            else 
            {
                end=letmedian-1;
            }
        }
        return start;
    }

    private int countSmallerOrEqual(int[][] matrix, int letmedian) {
        int count=0;
        int rows=matrix.length;
        int cols=matrix[0].length;

        for(int i=0; i<rows; i++) 
        {
            int start=0, end=cols-1;
            while(start<=end) 
            {
                int mid=start+(end-start)/2;
                if(matrix[i][mid]<=letmedian) 
                {
                    start=mid+1;
                } 
                else 
                {
                    end=mid-1;
                }
            }
            count=count+start;
        }
        return count;
    }
}
