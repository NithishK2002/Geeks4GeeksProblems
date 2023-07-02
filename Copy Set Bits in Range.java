//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line[] = in.readLine().trim().split("\\s+");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            int l = Integer.parseInt(line[2]);
            int r = Integer.parseInt(line[3]);
            
            Solution ob = new Solution();
            System.out.println(ob.setSetBit(x, y, l, r));
        }
    }
}
// } Driver Code Ends
//LOGIC

/*
8 - > 1000
5 - > 101
x = 8
y = 5
left = 1
right = 4
Expected Output = 1101

  From 1 to 4 in y (from left to right)
  101
  To get this digits within the range left to right
  First create mask = 1
  In binary 0001
  Here right = 4 and left = 1
  So right - left + 1 = 4

  Shift mask 4 times left 
  mask = mask << 4

  now mask = 1000

  mask - 1

  now mask = 0111

  Shift mask left by left - 1
  Here left = 0 So 0 times
  So mask = 0111

  Now Do AND mask and y

  0111 & 0101 = 0101

  now mask = 0101

  Do OR on mask and x
  1000 | 0101 = 1101
  
  Result = 1101
*/
//User function Template for Java

class Solution{
    static int setSetBit(int x, int y, int l, int r){
        // code here
        int mask = (1 << (r-l+1));
        mask--;
        mask = (mask << l-1);
        int y1 = y & mask;
        x = x | y1;
        return x;
    }
  
}
