package DynamicProgramming;

import java.util.Scanner;

public class BinaryStringWithNoConsecutive0 {

	public static void main(String[] args) {
		// Solveing problem by using two arrays extra space
		
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] dp0 = new int[n+1];
         int[] dp1 = new int[n+1];
         
         dp0[1]= 1;
         dp1[1] = 1;
         
         for(int i = 2;i<= n;i++) {
        	 dp1[i] = dp1[i-1] +dp0[i-1];  // in dp of 1 last time 0 and 1 both included 
        	 dp0[i] = dp1[i-1];            // in dp of 0 last time 1 is included only not zero because if we include 0 then their will we two consecutive 0 .
        	 
         }
         System.out.print(dp1[n] + dp0[n]);
	}

}
