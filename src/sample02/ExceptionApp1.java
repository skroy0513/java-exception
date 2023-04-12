package sample02;

public class ExceptionApp1 {

	/**
	 * 문자열을 전달받아서 정수로 변환해서 반환한다.
	 * @param text 숫자로 구성된 문자열
	 * @return 정수값
	 */
	public static int toInt(String text) {
		int number = Integer.parseInt(text);
		return number;
	}
	
	public static void main(String[] args) {
		
		try {
		int value = toInt("h1234");
		System.out.println(value);			
		} catch (NumberFormatException ex) {	// main메소드에서 예외를 catch 했기 때문에 오류가 나면 아무것도 출력되지 않는다.
			
			String errorMessage = ex.getMessage();			// 오류메세지
			System.err.println("오류 메세지 : " + errorMessage);
			
			String text = ex.toString();					// 예외클래스와 오류메세지
			System.out.println("toString() -> " + text);
			
			ex.printStackTrace();							// 오류발생경로, 개발단계에서는 꼭 적어야 오류 내용을 파악할 수 있다.
		}
	}
}
