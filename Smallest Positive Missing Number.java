//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        int low=0;
        int high=size-1;
        int oneIndex=binarySearch(arr,1,low,high);
    	if(oneIndex<0)
    		return 1;
    	for(int i=oneIndex;i<size-1;i++)
    	{
    		if(arr[i+1]-arr[i]>1)
    		{
    			return arr[i]+1;
    //			break;
    		}
    	}
    	return arr[size-1]+1;
    }
    static int binarySearch(int arr[],int x,int low,int high)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
}


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}


// } Driver Code Ends
