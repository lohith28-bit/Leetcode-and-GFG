//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
   
	public int findK(int matrix[][], int n, int m, int k)
	{
	    // Your code goes here
	    int cnt = 0;
	    int ans = 0;
        for(int row = 0 ; row <= matrix.length/2 ; row++){
            int i = row,j = row;
            boolean flag = true;
            while(j < matrix[row].length - cnt){
                if(ans == k-1) return matrix[i][j];
                j++;
                ans++;
                flag = false;
            }
            if(flag) break;
            flag = true;
            // ans--;
            j--;
            i++;
            while(i < matrix.length - cnt){
                // lst.add(matrix[i][j]);
                if(ans == k-1) return matrix[i][j];
                ans++;
                i++;
                flag = false;
            }
            if(flag) break;
            flag = true;
            i--;
            j--;
            // ans--;
            while(j >= cnt){
                // lst.add(matrix[i][j]);
                if(ans == k-1) return matrix[i][j];
                ans++;
                j--;
                flag = false;
            }
            if(flag) break;
            flag = true;
            cnt++;
            j++;
            // ans--;
            i--;
            while(i >= cnt){
                // lst.add(matrix[i][j]);
                if(ans == k-1) return matrix[i][j];
                ans++;
                i--;
                flag = false;
            }
            if(flag) break;

        }
        return -1;
	}
	
}