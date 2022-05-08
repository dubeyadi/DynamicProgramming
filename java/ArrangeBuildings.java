package DynamicProgramming;

import java.util.Scanner;

public class ArrangeBuildings {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long n = sc.nextLong();
	long ob = 1;
	long os = 1;
	for(int  i= 2 ;i<n;i++) {
		long nb = os;
		long ns = os+ob;
		
		os = ns;
		ob = nb;
		
	}
	long total = os+ob;
	total = total * total;
	System.out.println(total);
	
}
}
