package question03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("매수 수량 입력>>");
		int buy =scanner.nextInt(); //수량
		int b = 520; 
		int a =(buy*b)/100;
		int c =(buy*b)%100/10;
		System.out.println("100달러 짜리 "+a);
		System.out.print("10달러 짜리 "+c);
		
//		int money = buy*b;
//		res = money/100;
		
		
		
		
		scanner.close();
	}
}
