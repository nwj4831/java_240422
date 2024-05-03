package chapter03;
/*
 * 문자열을 정수로 변환
 * 변환안될때를 대비해서 예외 처리
 */
public class NumberFormatException {
	public static void main(String[] args) {
//		String[] stringnumber= {"23","12","3","998"};
		String[] stringnumber= {"23","12","aaa","9.98"};
		int i;
		
		for (i = 0; i < stringnumber.length; i++) {
			try {
//				Integer : wraper 클래스
//				parseInt : 문자열을 정수로 변환하는 메소
				int j = Integer.parseInt(stringnumber[i]);
				System.out.println("숫자로 변환된 값은 "+j);
				
			} catch (Exception e) {
				System.out.println(stringnumber[i]+"는 정수로 변환할 수 없습니다.");
			}
		}
	}
}
