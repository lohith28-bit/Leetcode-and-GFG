//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            
            int Key;
            Key = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            boolean res = obj.Search(N, A, Key);
            
            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static boolean Search(int N, int[] nums, int target) {
        // code here
        int strt = 0, end = nums.length-1;
        while(strt <= end){
            int mid = strt + (end - strt)/2;
            if(nums[mid] == target) return true;
            if(mid+1 <nums.length && nums[mid+1] == target) return true;
            if(mid-1 > -1 && nums[mid-1] == target) return true;
            if(nums[strt] <= nums[mid]){
                if(nums[strt] <= target && target <= nums[mid]){
                    end = mid-1;
                }else{
                    strt = mid+1;
                }
            }else{
                if(nums[mid] <= target && target <= nums[end]){
                    strt = mid+1;
                }else{
                    
                    end = mid-1;
                }
            }
        }
            return false;
    }
}
        
