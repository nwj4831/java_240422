package question;

import java.util.Scanner;

public class IfExMaxMin {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("정수 3개 입력");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d=0;
		int e=0;
		if ((a>=b && a>=c)) {
			d=a;
		}else if((b>=a && b>=c)) {
			d=b;
		}else if(c>=a && c>=b) {
			d=c;
		}
		if (a<=b && a<=c) {
			e=a;
		}else if(b<=a && b<=c) {
			e=b;
		}else if(c<=a && c<=b) {
			e=c;
		}
		System.out.println("최대값은 "+d);
		System.out.println("최소값은 "+e);
	scanner.close();
	}

}
