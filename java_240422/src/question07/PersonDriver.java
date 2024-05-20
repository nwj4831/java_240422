package question07;

import java.util.Scanner;

class Person{
	String lastName,firstName;
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getLength() {
		return lastName.length() +firstName.length();
	}
}
public class PersonDriver {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Person person1 = new Person();
		Person person2 = new Person();
		String lname,fname;
		System.out.print("성을 입력하세요");
		 lname = scanner.next();
		System.out.print("이름을 입력하세요");
		 fname = scanner.next();
		
		person1.lastName=lname;
		person1.firstName=fname;
		
		System.out.println("성 : "+person1.getLastName()+
						" 이름: "+person1.getFirstName()+
					" 성명의 길이: "+person1.getLength());
		
		System.out.print("성을 입력하세요");
		 lname = scanner.next();
		System.out.print("이름을 입력하세요");
		 fname = scanner.next();
		
		person2.lastName=lname;
		person2.firstName=fname;
		
		
		System.out.println("성 : "+person2.getLastName()+
				" 이름: "+person2.getFirstName()+
				" 성명의 길이: "+person2.getLength());
		
		scanner.close();
	}
}
