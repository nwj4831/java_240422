package question06;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("양수 10개를 입력하시오>>");
		int array[]=new int[10];
		int min=0;
		int max=0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] =scanner.nextInt();
			if (i == 0) {
				min = array[i];
			}
			if (array[i] < min){
				min = array[i];
			}
			if (array[i] > max){
				max = array[i];
			}
		}
		System.out.print("가장 작은 수는 "+min+"이고 ");
		System.out.println("가장 큰 수는 "+max+"이고 ");
		System.out.print("최소값+최대값은 "+(min+max)+"입니다. ");
		scanner.close();
//		int array[]= new int[10];
//		for (int i = 0; i < array.length; i++) {
//			array[i] =scanner.nextInt();
//		}
//		int min=array[0];
//		for (int i = 0; i < array.length; i++) {
//			if(array[i]< min) {
//				min=array[i];
//			}
//		}
//		int max = array[0];
//		for (int i = 0; i < array.length; i++) {
//			if(array[i]> max);{
////			max=array[i];
//			}
//			System.out.println(max);
//		}
//		System.out.println("가장 작은 수는"+min+"이고"+"가장큰수는"+max);
	}
}
