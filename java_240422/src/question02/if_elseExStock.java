package question02;

import java.util.Scanner;

public class if_elseExStock {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("코스피 지수 입력(1800~2500):");
		int k= scanner.nextInt();
		System.out.print("환율 입력(1100~1200):");
		int h= scanner.nextInt();
		if (h<1150) {
			if (k >=2300) {
				System.out.println("상승장");
			}else if (k>=2000) {
				System.out.println("횡보장");
			}else {
				System.out.println("하락장");
			}
		}else {
			if (k >=2200) {
				System.out.println("상승장");
			}else if (k>=2000) {
				System.out.println("횡보장");
			}else {
				System.out.println("하락장");
			}	
		}
//		if (h>=1150) {
//			if(k>=2200) {
//				System.out.println("상승장");
//			}else{
//				System.out.println("하락장");
//			}
//		}else if(k>=2300){
//			System.out.println("상승장");
//		}else {
//			System.out.println("횡보장");
//		}
	scanner.close();
	}
	
}
