package chapter02;

public class roto {
	public static void main(String[] args) {
		int n = ro(); 
//			System.out.println(n);
			switch (n) {
			case 1: System.out.println("김치찌개");
			break;
			case 2: System.out.println("된장찌개");
			break;
			case 3: System.out.println("돈가스");
			break;
			case 4: System.out.println("돼지국밥");
			break;
			case 5: System.out.println("냉면");
			break;
			case 6: System.out.println("정식");
			break;
			case 7: System.out.println("한식뷔페");
			break;
			case 8: System.out.println("칼국수");
			break;
			case 9: System.out.println("피자");
			break;
			case 10: System.out.println("햄버거");
			break;
			case 11: System.out.println("수구레국밥");
			break;
			case 12: System.out.println("뼈해장국");
			break;
			case 13: System.out.println("짜장");
			break;
			
			default:System.out.println("굶어");
				break;
			}
	}
	public static int ro() {
		double x = 45 * Math.random();
		int temp = (int)x;
		return temp+1;
	}

}
