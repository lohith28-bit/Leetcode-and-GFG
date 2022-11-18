//{ Driver Code Starts


import java.util.*;
import java.io.*;
class PeakElement{
	public static void main(String[] args)throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
		int t=Integer.parseInt(in.readLine().trim());
		while(t-->0){
			int n=Integer.parseInt(in.readLine().trim());
			int[] a=new int[n];
		    int[] tmp=new int[n];
		    String s[]=in.readLine().trim().split(" ");
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(s[i]);
				tmp[i] = a[i];
			}
		    
		    int f=0;
			int A=(new Solution()).peakElement(tmp,n);
			
			if(A<0 && A>=n)
			    out.println(0);
			else
			{
    			if(n==1 && A==0)
    			    f=1;
    			else if(A==0 && a[0]>=a[1])
    			    f=1;
    			else if(A==n-1 && a[n-1]>=a[n-2])
    			    f=1;
    			else if(A >= 0 && A < n && a[A] >=a[A+1] && a[A]>= a[A-1])
    			    f=1;
    			else
    			    f=0;
			    out.println(f);
			}
		}
		out.close();
	}
}
// } Driver Code Ends


/*Complete the function below*/

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] nums,int n)
    {
       //add code here.
       if(nums.length == 1) return 0;
        if(nums.length == 2) {
            if(nums[0] < nums[1]) return 1;
            return 0;
        }
        int max = Integer.MIN_VALUE,cnt = -1;
        int i = 1, j = nums.length-2 ;
        for(; i <= j ; i++, j--){
            if(nums[i-1] <= nums[i] && nums[i] >= nums[i+1]){
                return i;
            }
            if(nums[j-1] <= nums[j] && nums[j] >= nums[j+1]){
                return j;
            }
            if (max < nums[i-1]){
                max = nums[i];
                cnt = i-1;
            }
            if (max < nums[j+1]){
                max = nums[j];
                cnt = j+1;
            }
        }
        return cnt;
    }
}