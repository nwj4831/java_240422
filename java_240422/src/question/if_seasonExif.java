package question;

import java.util.Scanner;

public class if_seasonExif {
	public static void main(String[] args) {
		System.out.println("달을 입력하세요(1~12)");
		Scanner scanner=new Scanner(System.in);
		int a = scanner.nextInt();
		
		if (a>=3 && a<=5) {
			System.out.println("봄");
//		else if = 위에조건이 아닐경우 다른조건
		} else if(a>=6 && a<=8){ 
			System.out.println("여름");
		} else if(a>=9 && a<=11){ 
			System.out.println("가을");
//		=:대입, ==:판별
		} else if(a==12 || a==1 ||a==2)
				System.out.println("겨울");
		else {
			System.out.println("그딴거 없다");
		}
		scanner.close();
	}
}
