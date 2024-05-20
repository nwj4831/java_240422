package chapter09;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
//		File dir = new File("D:/aaa");
		File dir = new File("D:/aaa/bbb");
		File file1 = new File("D:/aaa/file1.txt");//파일
		File file2 = new File("D:/aaa/file2.txt");//파일
		File file3 = new File("D:/aaa/file3.txt");//파일
		
//		파일만들기
//		dir.createNewFile();
//		dir.mkdir();//디렉토리 만들기
		dir.mkdirs();//하위 디렉토리까지 같이 만들기
		file1.createNewFile();//파일 만들기
		file2.createNewFile();//파일 만들기
		file3.createNewFile();//파일 만들기
		
		File test = new File("d:/aaa");//디렉토리 정보를 가지고 test객체 생성
		File[] contents = test.listFiles();// 디렉토리 정보를 가지고 온다.(하위 디렉토리+파일들)
		System.out.println("날짜            시간       형태            크기         이름");
		System.out.println("------------------------------------------------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for (int i = 0; i < contents.length; i++) {
//			1716170851978 : 1970년 1월1일 기준으로 오늘가지 milisec(1/1000초)로 계산된 값(long type)
//			System.out.print(contents[i].lastModified());// 마지막 생성일
//			System.out.print(new Date(contents[i].lastModified()));// 마지막 생성일
			System.out.print(sdf.format(new Date(contents[i].lastModified())));// 마지막 생성일
			
			if (contents[i].isDirectory()) { //디렉토리이면 참
			System.out.println("\t<DIR>\t\t"+contents[i].getName()); //디렉토리나 파일 이름
			} else {
				System.out.println("\t\t\t"+contents[i].length()+"\t"+contents[i].getName()); //디렉토리나 파일 이름
			}
		}
	}
}
