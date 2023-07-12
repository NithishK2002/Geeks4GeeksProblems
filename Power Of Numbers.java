//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    
    // compute reverse of a number
    public static long rev(long n)
    {
        long rev_num = 0;
         while(n > 0) 
          { 
            rev_num = rev_num*10 + n%10; 
            n = n/10; 
          } 
          return rev_num;
    }
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
        //testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int N;
		    
		    
            //input N
		    N=sc.nextInt();
		    int R=0;
		    
		    	    
            // reverse the given number n
		    R=(int)rev(N);
	
            //power of the number to it's reverse
		    long ans=(long)obj.power(N,R);
		    System.out.println(ans);
		    
		    
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java
/*
BASIC IDEA
for 2^10 we can do 2^5 * 2^5 so for even we are squaring the half one's result 
but for odd 
2^5 we can do 2 * 2^4 so here 2^4 follows the same 2^2 * 2^2 --> 2^1 * 2^1 ---> 2 * 2^0
*/
class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        int mod=1000000007;
        long ans=0;
        if(R==0)
          return 1;
        if(R%2==0)
        {
          ans=power(N,R/2);
          ans=(ans*ans)%mod;
        }
        else
        {
          ans=N%mod;
          ans=(ans*power(N,R-1)%mod)%mod;
        }
        return (ans)%mod;
    }
    
    
}
