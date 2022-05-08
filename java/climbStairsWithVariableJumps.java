package DynamicProgramming;
import java.util.*;
public class climbStairsWithVariableJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i =0;i< arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int dp[] = new int[n+1];
		dp[n] = 1;
		
		for(int i = n-1;i>=0;i--) {
			for(int j =0; j <= arr[i] && i+j <dp.length; j++ ) {
				dp[i] += dp[i+j];
			}
		}
System.out.println(dp[0]);
	}

}
