package question06;
//math+science+english
import java.util.Scanner;
public class Grade {
	private int a,b,c;
	public Grade(int math, int science, int english) {
		 a =math;
		 b =science;
		 c =english;
		}
	public int average() {
		return  (a+b+c)/3;
	}
	public static void main(String[] args) {
		 System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		 Scanner scanner = new Scanner(System.in);
		 int math = scanner.nextInt();
		 int science = scanner.nextInt();
		 int english  = scanner.nextInt();
		 
		 Grade me = new Grade(math , science, english);
		 
		 System.out.println("평균은 " + me.average());
		 scanner.close();	 
	}
}
