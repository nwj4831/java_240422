package question04;
/*
 * 배열 리턴2(메소드 이용)
 * 일차원 배열 생성(정수1~10)
 * 배열 리턴 ->배열원소 +100 =>출력
 */
public class ReturnArray2 {
	public static int[] makeArray() {
		int temp[]= new int[10];
		
//		temp.length:10
		for (int i = 0; i < temp.length; i++) {
			temp[i]= i+1;
		}
		return temp;
	}
	public static void main(String[] args) {
		int intArry[];
		intArry = makeArray();
		//intArry.length :10
		for (int i = 0; i < intArry.length; i++) {
			System.out.print(intArry[i]+100+" ");
		}
	}
}
