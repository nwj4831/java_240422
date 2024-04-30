package question02;


public class whileTest1 {
	public static void main(String[] args) {
		int sum =0;
		int b =0;
		while (b <100) {
			sum += b;
			b += 2;
			System.out.println("@@ b>> "+b);
			System.out.println("@@ a>> "+sum);
		}
		System.out.println(sum);
		
	}

}
