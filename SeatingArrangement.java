class Solution {
    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        // code here
        boolean result=false;
        
        for(int i=0;i<m;i++)
        {
            if(n==0)
            {
                result=true;
                break;
            }
            if(seats[i]==0)
            {
                int left=(i==0)?Math.max(i,i-1):Math.min(i,i-1);
                int right=(i==m-1)?Math.min(i,i+1):Math.max(i,i+1);
                if(seats[left]==0 && seats[right]==0)
                {
                    seats[i]=1;
                    n--;
                    if(n==0)
                    {
                        result=true;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
