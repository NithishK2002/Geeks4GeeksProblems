/{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        Queue<Character> queue=new LinkedList<>();
        HashSet<Character> hset=new HashSet<>();
        char c=A.charAt(0);
        StringBuilder s=new StringBuilder();
        s.append(c);
        hset.add(c);
        queue.add(c);
        for(int i=1;i<A.length();i++)
        {
            c=A.charAt(i);
            if(hset.contains(c))
            {
                queue.remove(c);
            }
            else
            {
                hset.add(c);
                queue.add(c);
            }
            if(!queue.isEmpty())
            {
                s.append(queue.peek());
            }
            else
            {
                s.append("#");
            }
        }
        return s.toString();
    }
}
