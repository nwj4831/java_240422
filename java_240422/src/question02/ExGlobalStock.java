package question02;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("매수금액입력하세요 :");
		int buy= scanner.nextInt();
		System.out.print("매도금액입력하세요 :");
		int sell= scanner.nextInt();
		double y=0;
		if (buy<sell) {
			y=(sell-buy)*0.22;
		} else {
			y=0;
		}
		System.out.println("양도세 = "+y);
		scanner.close();
	}
}
