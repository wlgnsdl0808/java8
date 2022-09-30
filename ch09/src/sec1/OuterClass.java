package sec1;
//중첩 클래스 : 클래스 내부에 클래스가 있는 클래스로 외부 클래스와 내부 클래스로 구분한다.
public class OuterClass {
	int field1;
	
	public OuterClass(){}
	public void method1(){System.out.println("외부 클래스");}
	//내부(맴버) 클래스 Inner
	class Inner{
		int field1;
		public Inner(){}
		public void method1(){System.out.println("내부 클래스");}
	}
	//내부(맴버) 클래스 Inner2
	static class Inner2{
		int field1;
		static int field2;
		public Inner2(){}
		public void method1(){System.out.println("내부 정적 클래스");}
		static public void method2(){System.out.println("내부 정적 클래스2");}
	}
}
