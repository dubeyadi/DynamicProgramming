package DynamicProgramming;

import java.util.Scanner;

public class Goldmine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[][] dp = new int[n][m];
		
		for(int j = arr[0].length-1;j>=0;j--) {
			for(int i = arr.length-1;i>=0;i--) {
				if(j== arr[0].length -1) {
					dp[i][j]=arr[i][j];
				}
				else if(i==0) {
					dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]);
				}
				else if(i== arr.length -1) {
					dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i-1][j+1]);
				}
				else {
					dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], Math.max(dp[i+1][j+1],dp[i-1][j+1]));
				}
			}
			
		}
		int max= dp[0][0];
		for(int k =0;k<dp.length;k++) {
			if(dp[k][0]>max) {
				max = dp[k][0];
			}
		}
		System.out.println(max);

	}

}
