package question06;

//import java.util.Iterator;
//import java.util.Random;

public class RandomTen {
	public static void main(String[] args) {
		int n[] = new int[10];
		int sum=0;
		
		for (int i = 0; i < n.length; i++) {
			int r = (int)(Math.random()*10)+1;
			n[i] = r;
			sum += n[i];
		}
		System.out.println("랜덤한 정수들 : ");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println("\n평균은 "+(double)sum/n.length);
	}
}
//		int ten[] = new int[10];
//		Random generator = new Random();
//		int sum=0;
//		for (int i = 0; i < ten.length; i++) {
//			ten[i] = generator.nextInt(10)+1;
//			System.out.print("랜덤한 정수들:"+ten[i]);
////			System.out.print("");
//			sum += i; 
//		}
//	 System.out.println("평균은"+sum);
//	}
