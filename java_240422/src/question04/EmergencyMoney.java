package question04;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
//		상수로 100달러 원화 계산
		final int hundred=120000;
//		final int ten=12000;
		int res, money, num;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("가구수를 입력하시오>>");
		num =scanner.nextInt();
		
		if(num == 1) {
			money = 400000;
		}else if (num ==2) {
			money = 600000;
		}else if (num ==3) {
			money = 800000;
		}else {
			money = 1000000;
		}
		
		res = money/hundred;
//		100달러 짜리가 1개이상일때
		if(res > 0) {
			System.out.println("100달러짜리 "+res+"매");
		}
		//나머지 돈을 다시 셋팅
		money = money%hundred;
//		10달러 계산해야 함
		res = money/hundred;
//		100달러 짜리가 1개이상일때
		if(res > 0) {
			System.out.println("10달러짜리 "+res+"매");
		}
		scanner.close();
	}
		
//		System.out.print("가구수를 입력하시오>>");
//		int home =scanner.nextInt();
//		int won =0;
//		int dor =0;
//		int h=0;
//		int t=0;
//		if (home==1) {won=400000;}
//		if (home==2) {won=600000;}
//		if (home==3) {won=800000;}
//		if (home>=4) {won=1000000;}
//		dor = won/1200;
//		h=dor/100;
//		t=dor%10;
//
//		System.out.println("100달러짜리 "+h+"매");
//		
//		System.out.println("10달러짜리 "+t+"매");
//	}
}
