class Solution {
    public static boolean makeChanges(int N, int K, int target, int[] coins) {
        // code here
        int one = K-1;
        int two = 1;
        int result = 0; 
        for(int i=0;i<N;)
        {
            result=coins[i]*one;
            if(result>target)
            {
                one-=1;
                two+=1;
                if(one==0)
                {
                    i++;
                    one=K-1;
                }
                continue;
            }
            for(int j=0;j<N;j++)
            {
                result = coins[i]*one + coins[j]*two;
                // System.out.println(" result = "+ coins[i] + " * " + one + " + " + coins[j] + " * " + two);
                // System.out.println(result);
                if(result==target)
                {
                    return true;
                }
            }
            one-=1;
            two+=1;
            if(one!= 0)
            {
                i=0;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
