//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findMin(A, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int findMin(int nums[], int n)
    {
        //complete the function here
        int strt = 0, end = nums.length-1 , min = Integer.MAX_VALUE;
        while(strt <= end){
            int mid = strt + (end - strt)/2;
            min = Math.min(min,nums[mid]);
            if(nums[strt] <= nums[mid]){
                min = Math.min(min,nums[strt]);
                strt = mid+1;
            }else{
                end = mid-1;
            } 
        }
        return min;
    }
}
