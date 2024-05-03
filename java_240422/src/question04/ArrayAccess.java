package question04;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
//		int a=scanner.nextInt();
//		int b=scanner.nextInt();
//		int c=scanner.nextInt();
//		int d=scanner.nextInt();
//		int e=scanner.nextInt();
//		int big[] = {a,b,c,d,e};
		/*
	int big[]= new int[5];
	for (int i = 0; i < big.length; i++) {
		 big[i]=scanner.nextInt();
	}
	int h=0; 
	int count=0;
	
	for (int i = 0; i < 5 ; i++) {
		if (big[i] >big[count]) {
			h=big[i];
			count++;
		}else {
			h=big[count];
		}
		*/
		int max=0;
		int intArray[]= new int[5];
		
		for (int i = 0; i < intArray.length; i++) {
//			5번 반복해서 양수 5개를 배열원소에 저장
			intArray[i] = scanner.nextInt();
		}
		for (int i = 0; i < intArray.length; i++) {
//			배열 원소가 최대값보다 크면 max에 저장
			if(intArray[i]> max) {
				max=intArray[i];
		}
		
		
	}
	System.out.println("가장 큰 수는 "+max+"입니다");
	scanner.close();
	}

}
