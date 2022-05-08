package DynamicProgramming;

import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        for(int i = 0 ;i<dp.length;i++) {
        	int fibo = fibonacci(n);
        	System.out.println(fibo);
        }
	}
	static int fibonacci(int n ) {
		if(n==0) {
			return 0;
		} if(n==1) {
			return 1;
		}
		if(dp[n] != 0) {
			return dp[n];
		}
		
		return ;
		
	}

}
