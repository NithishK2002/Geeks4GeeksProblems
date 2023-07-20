//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        LinkedHashMap<Character,Integer> lmap=new LinkedHashMap<>();
        for(int i=0;i<S.length();i++)
        {
            char c=S.charAt(i);
            if((lmap.get(c))==null)
                lmap.put(c,0);
            if((lmap.get(c))>=1)
            {
                lmap.put(S.charAt(i),lmap.get(c)+1);
            }
            else
            {
                lmap.put(S.charAt(i),1);
            }
                
        }
        for(Map.Entry<Character,Integer> i:lmap.entrySet())
        {
            if(i.getValue()==1)
                return i.getKey();
        }
        return '$';
    }
}

