public class EliminationGame {
    public static int lastRemaining(int n) {
        int first=1, step=1;
        boolean leftToRight=true;

        while(n>1) 
        {
            if(leftToRight||n%2==1) 
            {
                first=first+step;
            }
            step=step*2;
            n=n/2;
            leftToRight=!leftToRight;
        }
        return first;
    }

    public static void main(String[] args) {
        int n=9;
        int ans=lastRemaining(n);
        System.out.println(ans);
    }
}
