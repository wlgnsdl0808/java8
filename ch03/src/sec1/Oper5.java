package sec1;

public class Oper5 {

	public static void main(String[] args) {
		//비트 (2진) 연산
		int a=10, b=20, c=30, d=40, e, f, g, h;
		e = c & d;
		f = c | d;
		g = ~(c & d);
		h = c ^ d;
		System.out.println("c & d =>" +e);	//2진수 and -> 8
		System.out.println("c ! d =>" +f);	//2진수 or -> 62
		System.out.println("~(c & d) => "+g);	//2진수 보수 -> -9
		System.out.println("c ^ d => " +h);	//베타적 OR(eXclusive OR) -> 54
		System.out.println("d >> 2 => "+(d >> 2));	//오른쪽 시프트 (Shift) -> 10
		System.out.println("d << 2 => "+(d << 2));	//왼쪽 시프트 (Shift) -> 160
		System.out.println("d >>> 2 => "+(d >>> 2));	// 오른쪽 이중시프트 -> 10
		System.out.println("d <<< 2 는 존재하지 않음 ");	// 왼쪽 이중 시프트는 연산자가 없음
		//연산시 부정과 불능 그리고 예외처리
		//System.out.println(a / 0);	//Not a Number -> NaN
		//System.out.println("k" / 0);
		//System.out.println('k' / 4);
		//System.out.println(a % 0);	//Infinity
		try {
			int k = 20;
			System.out.println(k / 0);//실행해야할 구문
		} catch(ArithmeticException el){	//실행해야할 구문이 오류 발생시 처리해야할 내용
			System.out.println("산술연산에 오류가 존재함");
			//el.printStackTrace();
		}
	}

}
