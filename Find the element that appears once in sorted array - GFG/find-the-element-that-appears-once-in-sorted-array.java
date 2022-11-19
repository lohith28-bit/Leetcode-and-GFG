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
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findOnce(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    int findOnce(int nums[], int n)
    {
        // Complete this function
        int strt = 0 , end = nums.length-1;
        if(nums.length == 1) return nums[0];
        if(nums[1] != nums[0]){
                return nums[0];
        }
        if(nums[nums.length-1] != nums[nums.length-2]){
                return nums[nums.length-1];
        }
        while(strt <= end){
            int mid = strt + (end - strt)/2;
            if((mid > 0 && nums[mid-1] != nums[mid]) && (mid < nums.length-1 && nums[mid] != nums[mid+1])){
                return nums[mid];
            }
            if(mid < nums.length-1 && nums[mid] == nums[mid+1]){
                mid++;
            }
            if((mid+1)%2 != 0){
                end = mid-2;
            }else{
                strt = mid+1;
            }
        }
        return -1;
    }
}