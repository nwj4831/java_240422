package question02;

import java.util.Scanner;

public class ComputeBalance {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("구매 금액을 입력하세요");
		int purchaseAmount= scanner.nextInt();
		int balance=0;
//		구매 금액이 30만원 이상일때
		if (purchaseAmount >= 300000) {
//			청구금액은 3만원 할인
			balance =purchaseAmount - 30000;
//		구매금액이 10만원 이상일때
		} else if(purchaseAmount<300000&&purchaseAmount >= 100000){
//			청구금액 5000원 할인
			balance =purchaseAmount - 5000;
		}else {
//			청구금액 = 구매금액
			balance =purchaseAmount;
		}
		System.out.println("구매금액 = " +purchaseAmount);
		System.out.println("청구 금액 = "+balance);
		scanner.close();
	}
}
