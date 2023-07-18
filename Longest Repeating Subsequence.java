//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        int size=str.length();
        int[][] lrs=new int[size+1][size+1];
        for(int i=0;i<=size;i++)
        {
            lrs[i][0]=0;
            lrs[0][i]=0;
        }
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size;j++)
            {
                if(str.charAt(i-1)==str.charAt(j-1) && i!=j)
                    lrs[i][j]=1+lrs[i-1][j-1];
                else
                    lrs[i][j]=Math.max(lrs[i][j-1],lrs[i-1][j]);
            }
        }
        return lrs[size][size];
    }
}
