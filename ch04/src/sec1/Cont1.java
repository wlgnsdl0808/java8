package sec1;
//제어문 : 프로그램 상 작업의 흐름을 제어하기 위한 명령문
//제어문은 조건분기문과 반복문으로 구성
public class Cont1 {

	public static void main(String[] args) {
		int a=90;
		if(a>=60){	//조건분기문
			pass();
		} else{
			fail();
		}
		int [] jum = {90,80,60,70,65,85,90};
		int hap=0;
		//반복문 : 위와 같이 100명 점수가 있어서 총점을 계산할 경우와 같이 더하는 것을 반복해야할 경우 사용
		for(int i=0;i<7;i++)
		{
			hap+=jum[i]; // hap=hap+jum[i];
		}
		System.out.println("총점 : "+hap);
	}
	public static void pass(){
		System.out.println("합격");
	}
	public static void fail(){
		System.out.println("불합격");
	}

}
