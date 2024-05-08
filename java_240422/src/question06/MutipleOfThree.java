package question06;

import java.util.Scanner;

public class MutipleOfThree {
	public static void main(String[] args) {
		
		System.out.print("양수 10개를 입력하시오>>");
		Scanner scanner=new Scanner(System.in);
		int[] g =new int[10];
		
		for (int i = 0; i < g.length; i++) {
			g[i] =scanner.nextInt();
		}
		for (int i = 0; i < g.length; i++) {
			
			if (g[i]%3 == 0) {
				System.out.print(g[i]+" ");
			}
		}
		scanner.close();
	}
}





