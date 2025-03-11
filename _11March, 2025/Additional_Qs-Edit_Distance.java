class Solution {
    public int editDistance(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        int[][] memo=new int[m+1][n+1];
        for(int i=0; i<=m; i++) 
        {
            for(int j=0; j<=n; j++) 
            {
                memo[i][j]=-1;
            }
        }
        return editd(s1, s2, m, n, memo);
    }

    public int editd(String word1, String word2, int m, int n, int[][] memo) {
        
        if(m==0) 
        {
            return memo[m][n]=n;
        }
        if(n==0) 
        {
            return memo[m][n]=m;
        }

        if(memo[m][n]!=-1) 
        {
            return memo[m][n];
        }

        // match ho gye last characters, to reduce kr do size ko in both strings
        if(word1.charAt(m-1)==word2.charAt(n-1)) 
        {
            return memo[m][n]=editd(word1, word2, m-1, n-1, memo);
        } 
        else 
        {
            // minimum of insert delete and replace operations
            int i=editd(word1, word2, m, n-1, memo);
            int d=editd(word1, word2, m-1, n, memo);
            int r=editd(word1, word2, m-1, n-1, memo);

            return memo[m][n]=1+Math.min(Math.min(i, d), r);
        }
    }
}
