package sec1;

public class Exception1 {

	public static void main(String[] args) {
		String data =null;
		try{
			
			System.out.println(data.toString());
		} catch(NullPointerException e){
			System.out.println("널 값은 문자열로 변경하여 출력하지 못함");
		} catch(Exception e){
			System.out.println("알 수 없는 장애로 인하여 실행이 계속되지 못함");
		} finally{
			System.out.println("종료");
		}
	}

}
