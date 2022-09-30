package sec1;

public class OuterEx1 {

	public static void main(String[] args) {
		OuterClass out1 = new OuterClass();
		out1.method1();
		
		OuterClass.Inner in1 = out1.new Inner();
		in1.method1();
		
		OuterClass.Inner2 in2 = new OuterClass.Inner2();
		in2.method1();
		OuterClass.Inner2.method2();

	}

}
