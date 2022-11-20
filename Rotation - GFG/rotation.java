//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int nums[], int n) {
        // code here
        int strt = 0, end = nums.length-1 , min = Integer.MAX_VALUE , res = -1;
        if(nums[0] < nums[n-1]) return 0;
        while(strt <= end){
            int mid = strt + (end - strt)/2;
            if(min > nums[mid]){
                min = nums[mid];
                res = mid;
            }
            if(nums[strt] > nums[mid]){
                if(min > nums[mid]){
                min = nums[mid];
                res = mid;
                }
                end = mid-1;
            }else{
                if(min > nums[mid]){
                min = nums[mid];
                res = mid;
                }
                if(min > nums[strt]){
                    min = nums[strt];
                    res = strt;
                }
                if(min > nums[end]){
                    min = nums[end];
                    res = end;
                }
                strt = mid+1;
            } 
        }
        return res;
    }
}