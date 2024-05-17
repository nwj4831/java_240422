package chapter07;

public class ProductExample {
	public static void main(String[] args) {
		Product<TV, String> product1 = new Product<>();
		product1.setKind(new TV());
		product1.setModel("스마트TV");
		
		TV tv = product1.getKind();// new Tv()
		//chapter07.TV@515f550a (패키지.클래스@해시코드
		System.out.println(tv);
		
		String tvmodel = product1.getModel();//스마트TV
		System.out.println(tvmodel);
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		
		Car car = product2.getKind();
//		chapter07.Car@5e91993f
		System.out.println(car);
		
		String carModel = product2.getModel();
		System.out.println(carModel);
	}
}
