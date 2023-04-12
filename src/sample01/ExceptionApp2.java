package sample01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionApp2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("11111");
			FileReader reader = new FileReader("src/sample01/sample01.txt");
			System.out.println("22222");
			BufferedReader br = new BufferedReader(reader);
			System.out.println("33333");
			String text = br.readLine();
			System.out.println("44444");
			System.out.println(text);
			System.out.println("55555");
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("지정된 파일을 찾을 수 없습니다.");
		} catch (IOException ex) {
			System.out.println("읽기 작업 중 오류가 발생하였습니다.");
		}
	}
}
