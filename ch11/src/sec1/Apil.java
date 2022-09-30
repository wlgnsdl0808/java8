package sec1;

public class Apil {

	public static void main(String[] args) {
		//jave.lang
		/*
		 Object : 자바에서 최상위 클래스
		 Systme : 기본 입출력(키보드 입력, 모니터 출력), JVM 동작 제어
		 Class : 클래스 개념과 클래스 구성요소를 메모리로 로딩
		 String : 문자열 다루기 위한 클래스
		 StringBuffer/StringBuilder : 문자열 조작(분리/합치기)
		 Math : 수학/삼각을 위한 처리 클래스
		 Wrapper : Character, Byte, Short, Integer, Long, Float,
		 			Double, Boolean
		 			primitive type은 메서드를 가질 수 없으므로
		 			Wrapper type의 메서드를 활용해야 함
		 */
		int a=1004; //Primitive type
		Integer b = new Integer(1004);	//Wrapper type
		
		String ab = "1004";
		int data1 = Integer.parseInt(ab);
		System.out.println(data1);
		
		String abc = "1004.1234";
		int data2 = Integer.parseInt(abc);
		System.out.println(data2);
		
		byte c = 66;
		Byte d = 66;
		
		short e = 1000;
		Short f = 1000; 
		
		//char <=> Character
		//float <=> Float
		//double <=> Double
		//long <=> Long
		//boolean <=> Boolean
	}

}
