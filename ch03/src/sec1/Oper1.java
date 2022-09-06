package sec1;
//프로그램의(Operation) 모든 명령은 Op-codr와 Operrand로 이루어짐
//주소(기억장소의 개수)에 따라 0주소 명령어 형식 - 3주소 명령어 형식
//입력형에 따라 단항(unary) 연산과 이형(binay) 연산으로 분류됨
//연산의 종류에 따라 산술, 논리, 비교,증감, 대입 연산 등이 있음
public class Oper1 {

	public static void main(String[] args) {
		int a=20, b=30, c;
		System.out.println(a);
		c = a + b;
		//운용방식1 : +ab -> pre(fix) order(전위)
		//운용방식2 : ab+ -> post(fix) order(후위)
		//운용방식3 : a+b -> in(fix) order(중위)

	}

}
