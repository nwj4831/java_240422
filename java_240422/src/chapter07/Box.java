package chapter07;

public class Box {
	private Object object; //홍길동 ,777 , 애플객체
	
	public Object get() {
		return object;
	}
//	Object object="홍길동" //up casting
//	Object object= 777 //up casting
//	Object object= new Apple() //up casting
	public void set(Object object) {
		this.object = object;
	}
}
