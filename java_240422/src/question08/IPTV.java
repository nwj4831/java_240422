package question08;

import question07.ColorTV;

class TV2{
	 private int size;
	 public TV2(int size) { 
		 this.size = size; 
	}
	 protected int getSize() {
		 return size; 
	}
	 public TV2 (String a) {
	 }
}
class ColorTV2 extends TV2{
	private int colors;
	private String string;
	public ColorTV2(String string) {
		super(string);
		this.string=string;
	}
	
	public ColorTV2(int size, int colors) {
	  super(size);
	  this.colors = colors;
	}
	public void printProperty() {
       System.out.println("나의 IPTV는"+string+getSize()+"인치 "+colors+"컬러");
   }
	public static void main(String[] args) {
		 ColorTV myTV = new ColorTV(32, 1024);
		 myTV.printProperty();
	}
}
public class IPTV extends ColorTV2{
	public IPTV(String string, int i, int j) {
		 super (string);
	}
	public static void main(String[] args) {
		IPTV iptv= new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}
}
