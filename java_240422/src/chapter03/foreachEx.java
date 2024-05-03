package chapter03;
/*
 * 열거형 이용(values()메소드 이용)
 * foreach
 */
public class foreachEx {
	enum Week{월,화,수,목,금,토,일};
	
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		String names[]= {"사과","배","바나나","체리","딸기","포도"};
		int sum=0;
		
//		int 타입 배열원소 n을 k로 하나씩 받는
		for (int k :n ) {
			System.out.print(k+" ");
			sum += k;
		}
		System.out.println("합은 "+sum);
		
		for (String s : names) {
			System.out.print(s+" ");
		}
		System.out.println();
//		Week 타입 값을 day로 하나씩 받는다
		for (Week day : Week.values()) {
//			열거형값을 string 타입으로 받을 수 없음
//			String str = day; // 오류
			Week str = day;
			System.out.print(str+"요일 ");
		}
		
	}
	
}
