package chapter02;

public class IntegerLiteralExample {
	public static void main(String[] args) {
//		0b~ 2진수
//		1*2의 3승+0*2의 2승+1*2의 1승+1*2의 0승
		int var1=0b1011;
//		0~8진수
//		2*8의 2승+0*8의 1승+6*8의 0승
		int var2=0206;
		int var3=365;
//		0x~ : 16진수
//		b*16의 1승+3*16의 0승
		int var4=0xb3;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
	}
}
