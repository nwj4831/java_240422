package question07;

class TV{
	 private int size;
	 public TV(int size) { 
		 this.size = size; 
	}
	 protected int getSize() {
		 return size; 
	}
	 public TV (String a) {
	 }
}
public class ColorTV extends TV{
	private int colors;
	private String string;
	public ColorTV(String string) {
		super(string);
		this.string=string;
	}
	public ColorTV(int size, int colors) {
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
