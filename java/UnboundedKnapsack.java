package DynamicProgramming;

import java.util.Scanner;

public class UnboundedKnapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] val = new int[n];
		for(int i = 0 ;i<n;i++) {
			val[i] = sc.nextInt();
		}
		int[] wat = new int[n];
		for(int j = 0;j<n;j++) {
			wat[j] = sc.nextInt();
		}
		int cap = sc.nextInt();
		int[] dp = new int[cap+1];
		dp[0] = 0;
		
		for(int bagc = 1;bagc<=cap;bagc++){
			int max = 0;
			for(int i =0;i<n;i++) {
				if(wat[i]<= bagc) {
					int rbagc = bagc-wat[i]; //remaining bag capacity
					int rbagv =dp[rbagc];   // remaining bag value
					int tbagv = rbagv + val[i]; //total bag value;
					if(tbagv >max) {
						max = tbagv;
					}
					
				}
			}
			dp[bagc] = max;
		}
		System.out.println(dp[cap]);
		
	}
	

}
