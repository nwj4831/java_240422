package chapter02;

public class LongExample {
	public static void main(String[] args) {
		long var1=10;
//		20L : 명시적으로 long 타입 리터럴(값)
		long var2=20L;
//		범위 벗어나면 오류(기본 타입 int)
//		long var3=10000000000;
		long var4=10000000000L;
		long var5=1000000000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		System.out.println(var5);
	}
}
