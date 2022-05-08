package DynamicProgramming;

import java.util.Scanner;

public class KnightsProbability {
	
	public static double knightProbability(int n, int k, int row, int column) {
        int[][] curr = new int[n][n];
        int[][] next = new int[n][n];
        
        curr[row][column] = 1;
        for(int move = 1;move<=k;move++){
            for(int i = 0;i< n;i++){
                for(int j = 0;j< n;j++){
                    if(curr[i][j] != 0){
                        int ni = 0;
                        int nj = 0;
                        
                        ni = i-2;
                        nj= j+1;
                        if(isValid(ni,nj,n)){
                        next[ni][nj] += curr[i][j] / 8.0;    
                        }
                        ni = i-1;
                        nj = j+2;
                        if(isValid(ni,nj,n)){
                        next[ni][nj] += curr[i][j] / 8.0;    
                        }
                        ni = i+1;
                        nj = j+2;
                        if(isValid(ni,nj,n)){
                        next[ni][nj] += curr[i][j] / 8.0;    
                        }
                        ni = i+2;
                        nj = j+1;
                        if(isValid(ni,nj,n)){
                        next[ni][nj] += curr[i][j] / 8.0;    
                        }
                        ni = i+2;
                        nj = j-1;
                        if(isValid(ni,nj,n)){
                        next[ni][nj] += curr[i][j] / 8.0;    
                        }
                        ni = i+1;
                        nj = j - 2;
                        if(isValid(ni,nj,n)){
                        next[ni][nj] += curr[i][j] / 8.0;    
                        }
                        
                        ni = i-1;
                        nj = j-2;
                        if(isValid(ni,nj,n)){
                        next[ni][nj] += curr[i][j] / 8.0;    
                        }
                        ni = i-2;
                        nj = j-1;
                        if(isValid(ni,nj,n)){
                        next[ni][nj] += curr[i][j] / 8.0;    
                        }
                        
                            
                        
                        
                        
                    }
                }
            }
            
             curr = next;
            next = new int[n][n];
            
        }
        double sum = 0;
        for(int i = 0;i<n;i++){
        for(int j = 0 ;j<n;j++){
            sum += curr[i][j];
        }
    }
        return sum;
    }
    
    public static boolean isValid(int ni,int nj,int n){
        if(ni>=0 && nj>= 0 && ni<n && nj <n){
            return true;
        }else{
            return false;
        }
    }

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int row = sc.nextInt();
		int column = sc.nextInt();
		//knightProbability(n,k,row,column);
		System.out.println(knightProbability(n,k,row,column));

	}

}
