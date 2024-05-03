package question04;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int arryten[]= new int[10];
		int sum=0;
		System.out.print(arryten.length+"개의 정수를 입력하세요>>");
		
		for (int i = 0; i < arryten.length; i++) {
			arryten[i]=scanner.nextInt();
			sum += arryten[i];
		}
		System.out.println("합계는 "+sum);
		scanner.close();
	}
}
