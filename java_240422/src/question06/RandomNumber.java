package question06;

import java.util.Random;

/*
 * 난수를 발생 math(클래스),Random(클래스)
 */
public class RandomNumber {
//		generator.nextInt();//난수 발생(범위:int타입 범위-> -2의31승 ~ 2의 31승-1
//		generator.nextInt(10);//난수 발생(0~9 정수)
//		generator.nextInt(10)+1;//난수 발생(1~10 정수)
//		generator.nextInt(10)*(-1);//난수 발생(-9~0 정수)
//		generator.nextDouble()double점위. nextFloat()Float범위
	public static void main(String[] args) {
		int rNumber;
		Random generator = new Random();
		while(true) {
			rNumber =generator.nextInt(10)+1;
			System.out.println(rNumber);
			
			if(rNumber==7) {
				break;
			}
		}
	}
}
		
//		int rNumber = 0;
//		while (rNumber !=7) {
//			rNumber = (int) (Math.random()*10);
//			System.out.println(rNumber);
//		}
