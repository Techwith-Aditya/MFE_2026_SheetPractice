public class SearchIn2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++)
        {
            if(matrix[i][0]<=target && target<=matrix[i][matrix[0].length-1])
            {
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            if(arr[mid]>target)
            {
                right=mid-1;
            }
            if(arr[mid]<target)
            {
                left=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] givenMatrix={
            {1,2,3},
            {4,6,7},
            {8,9,11}
        };
        boolean ans=searchMatrix(givenMatrix, 6);
        System.out.println(ans);
    }
}
