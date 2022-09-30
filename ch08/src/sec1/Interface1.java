package sec1;
//인터페이스는 완전 추상체이다.
public interface Interface1 {
	int MAX = 20;
	int MIN = 1;
	
	void method1();// 맴버 메서드는 선언만 가능하며, 실행 내용은 기술할 수 없다.
	int method2(int pa1, String pa2);
	static void method3(int pa1){	//정적 메서드는 선언과 실행 내용을 모두 기술
		System.out.println(pa1+"값을 전달 받았습니다.");
	}
	default int method4(String pa1){ //디폴드 메서드는 선언과 실행 내용을 모두 기술
		return 1004;
	}
}
