package sec;

public class ChildEx1 {

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.field1 = 10;		//부모 클래스로 부터 물려 받은 field1
		c1.field2 = "kim";	//부모 클래스로 부터 물려 받은 field2
		c1.field3 = 20;		//부모 클래스로 부터 물려 받은 field3
		
		
		Parent c2 = new Parent();
		c2.field1 = 100;
		c2.field2 = "lee";
		//c2.field2 = 200; //field3는 자식클래스에 있는 것이므로 활용할 수 없다.
		
		//부모 클래스로 부터 유도된 객체는 부모의 생성자 또는 자식의 생성자를 활용하여 객체를 생성할 수 있다.
		Parent c3;
		c3 = new Parent();
		c3.method1();
		System.out.println(c3.method2());
		
		//그러나 자식의 맴버는 활용될 수 없다.
		c3 = new Child();
		System.out.println(c3.method2());
		//c3.method3();
		//c3.method4();
		
		c3 = new Child2();
		c3.method1();
		c3.method2();
		//c3.method3();
		//c3.method4();
		//c3.method5();
		//c3.method6();
		
		c3 = new Child(100,"lee",50);
		System.out.println("child.field1="+c3.field1);
		System.out.println("child.field2="+c3.field2);
		//System.out.println(c3.field3);
		c3 = new Child2();
		System.out.println("--------- Child2로 재생성 후 -------------");
		System.out.println("child.field1="+c3.field1);
		System.out.println("child.field2="+c3.field2);

	}

}
