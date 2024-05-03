package chapter03;
/*
 * 문자열에서 r 알파벳 갯수 구하기
 * 알파뱃 대/소문자 상관없음
 * toCharArray() 메소드 사용
 */
public class Ex3_8 {
	public static void main(String[] args) {
		int count=0;
		String str = "proframming is fun! Right?";
//		str.toCharArray() : 문자열에서 문자 하나씩 가지고 옴(p~?)
		//str.toCharArray 
		char[] charArr =  str.toCharArray();
		
		
//		"proframming is fun! Right?" => 문자열 크기만큼 반복
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i]== 'R'||charArr[i] == 'r' ) {
				count++;
			}
		}
		System.out.println("=> R(r)dml 갯수: "+count);
	}
}
