package sec1;
//FunctionalInterface 메소드를 기반으로 기능을 람다식으로 정의하여 활용 : 인터페이스를 선언하고, 추상체를 구현하므로써 람다식을 활용
public class Lambda1 {
	public int method1(int x, int y){
		return x+y;
	}
	/*
	 (x, y) -> { x+y };
	*/
}
