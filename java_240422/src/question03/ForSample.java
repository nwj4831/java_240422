package question03;

public class ForSample {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <=10; i++) {
			if (i<=9) {
				System.out.print(i+"+");
			} else {
				System.out.print(i+"=");
			}
//			1~10 까지 숫자를 sum에 누적
			sum+=i;
		}
		System.out.print(sum);
	}
}
