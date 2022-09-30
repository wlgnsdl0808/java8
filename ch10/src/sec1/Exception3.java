package sec1;

public class Exception3 {

	public static void main(String[] args) {
		String date1 = "1004";
		String date2 = "kim1004";
		try{
		int val1 = Integer.parseInt(date1);
		int val2 = Integer.parseInt(date2);
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val1+20);
		} catch(NumberFormatException e){
			System.out.println("숫자 형식 데이터로 처리되지 못했음");
		} catch(Exception e){
			System.out.println("알 수 없는 예외");
		} finally{
			System.out.println("종료");
		}
	}

}
