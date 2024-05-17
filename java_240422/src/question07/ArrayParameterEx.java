package question07;
// 중상급b 5
public class ArrayParameterEx {
	static void printStringArray(String a[]) {
		//문자열 배열을 매개변수로 받아서 출력
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	//문자열 배열을 매개변수로 받아서 "be"->"eat" 변경
	static void replaceBe(String a[]) {
		//문자열 배열을 매개변수로 받아서 출력
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("be")) {
				a[i]="eat";
			}
		}
	}
	public static void main(String[] args) {
		String s[] = {"to"," ","be"," ","or"," ","not"," ","to"," ","be"};
		printStringArray(s);
		replaceBe(s);
		printStringArray(s);
	}
}
