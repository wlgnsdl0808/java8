package sec2;
//UserException 을 메소드를 활용하여 자동 예외 발생
public class UserException1 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (RunException e) {
			e.getMessage();
			//e.printStackTrace();
		}
	}
	public static void method1() throws RunException{
		throw new RunException("사용자 예외");
	}

}
