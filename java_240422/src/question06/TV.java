package question06;

public class TV {
	String aaa;
	int a;
	int b;
	public TV(String aaa,int a,int b){
		this.aaa = aaa;
		this.a = a;
		this.b = b;
	};
	void show() {
		System.out.println(aaa+"에서 만든 "+a+"년형 "+b+"인치 TV");
	}
	
	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		myTV.show();
	}
}
