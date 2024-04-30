package question;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		System.out.println("정수 3개 입력>>");
		Scanner scan = new Scanner(System.in);
		int a =scan.nextInt();
		int b =scan.nextInt();
		int c =scan.nextInt();
		int median=0;
		
		if ((a>b && a<c) || (a>c && a<b)) {
			median=a;
		}else if((b>a && b<c) || (b>c && b<a)) {
			median=b;
		}else {
			median=c;
		}
		
		System.out.println("중간값음 "+median);
		scan.close();
		}
		
	}

