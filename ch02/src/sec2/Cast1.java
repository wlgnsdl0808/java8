package sec2;

public class Cast1 {

	public static void main(String[] args) {
		int a=1004, b;
		short c, d;
		long e, f;
		b = 65538;
		//c = a;
		c = 500;
		a = c; //short -> int = 자동 형 변환(auto casting)
		d = (short) b; // 형 변환 연산자에 의한 형 변환(force casting)
		System.out.println("d="+d);
		System.out.println("b="+b);
	}

}
