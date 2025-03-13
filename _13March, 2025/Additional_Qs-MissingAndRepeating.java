// Solution-1: When return type is arraylist... 
// Two main things are used (one is Collections.nCopies(A.size()+1, 0)... Which means create n+1 size list and initialize all values with zero
// other thing is count.set(A.get(i), count.get(A.get(i)) + 1)...which means go to (A.get(i))'th index in count & incement that place by 1

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> count=new ArrayList<>(Collections.nCopies(A.size()+1, 0));
        ArrayList<Integer> ans=new ArrayList<>();
        int repeating=-1;
        int missing=-1;
        for(int i=0; i<A.size(); i++)
        {
            // count.get(A.get(i))++;
            count.set(A.get(i), count.get(A.get(i)) + 1);
        }
        
        for(int i=1; i<=A.size(); i++)
        {
            if(count.get(i)==0)
            {
                missing=i;
            }
            if(count.get(i)==2)
            {
                repeating=i;
            }
        }
        ans.add(repeating);
        ans.add(missing);
        return ans;
    }
}

// ______________________________________________________________________________________________________________________________________________________________

// Solution-2: When return type is array...
public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] count=new int[n+1];

        for(int i=0; i<n; i++)
        {
            count[arr.get(i)]++;
        }

        int repeating=-1;
        int missing=-1;
        for(int i=1; i<count.length; i++)
        {
            if(count[i]==2)
            {
                repeating=i;
            }
            if(count[i]==0)
            {
                missing=i;
            }
            if(repeating!=-1 && missing!=-1)
            {
                break;
            }
        }
        return new int[]{missing, repeating};
    }
}
