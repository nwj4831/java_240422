package question03;

public class DowhileTest {
	public static void main(String[] args) {
		int sum=0;
		int i=0;
		do {
			if(i>99) {
				break;
			}
			sum += i;
			i+=2;
//			i+=2;
//			System.out.println(i);
//			sum=sum+i;
//			System.out.println(sum);
//		} while (i<98);
		} while (true);
		System.out.println(sum);
	}
}
