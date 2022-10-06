package sec1;
//함수적 인터페이스 - 하나의 인터페이스는 하나의 메소드만 정의할 수 있음
@FunctionalInterface
interface Calc1 {	//매개변수X, 리턴X
	public void method1();
}
@FunctionalInterface
interface Calc2 {	//매개변수O, 리턴X
	public void method2(int x, int y);
}
@FunctionalInterface
interface Calc3 {	//매개변수X, 리턴O
	public int method3();
}
@FunctionalInterface
interface Calc4 {	//매개변수O, 리턴O
	public int method4(int x, int y);
}

public class Lambda2 {

	public static void main(String[] args) {
		//인터페이스명 객체명 = (매개변수)-> 리턴값
		Calc4 max = (x, y) -> x>y ? x : y;	//구현체 등록
		int data = max.method4(20, 18);
		System.out.println("최대값 : "+data);
	}

}
