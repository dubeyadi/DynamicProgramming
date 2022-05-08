package DynamicProgramming;

import java.util.Scanner;

public class Knapsack0_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] vals = new int[n];
       int[] wts = new int[n];
       for(int i = 0;i<vals.length;i++) {
    	   vals[i] = sc.nextInt();
       }
       for(int j = 0;j<wts.length;j++) {
    	   wts[j] = sc.nextInt();
       }
       int cap = sc.nextInt();
       int[][] arr = new int[n+1][cap+1];
       for(int i = 1;i<arr.length;i++) {
    	   for(int j= 1;j<arr[0].length;j++) {
    		   arr[i][j]= arr[i-1][j];
    		   if(j>=wts[i-1]) {
    			   int rCap = j -wts[i-1];
    			   if(arr[i-1][rCap] + vals[i-1] > arr[i-1][j]) {
    				 arr[i][j] = arr[i-1][rCap] + vals[i-1];  
    			   }else {
    				   arr[i][j] = arr[i-1][j];
    			   }
    			   
    			   
    		   }
    	   }
       }
       System.out.println(arr[n][cap]);
       
	}

}

