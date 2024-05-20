package question07;

import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 몇개?");
		int a = scanner.nextInt();
		int n[] = new int[a];
		for (int i = 0; i < a; i++) {
			n[i] = (int)(Math.random()*100)+1;
			if (i%10 == 0) {
				System.out.println();
			}
		System.out.print(n[i]+" ");
		}
		scanner.close();
	}
}
