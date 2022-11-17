//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //br.readLine();
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.beautySum(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int beautySum(String s) {
        // code here
        int res = 0;
    for(int i = 0 ; i < s.length() ; i++){
        int []freq = new int[26];
        for(int j = i ; j < s.length() ; j++){
            freq[s.charAt(j) - 'a']++;
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for(int k = 0 ; k < 26 ; k++){
                if(freq[k] != 0){
                    max = Math.max(freq[k],max);
                    min =Math.min(freq[k],min);
                    
                }
            }
            res += max-min;
        }
        
    }
    return res;
    }
}
        
