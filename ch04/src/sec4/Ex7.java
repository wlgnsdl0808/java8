package sec4;

public class Ex7 {

	public static void main(String[] args) {
		long sum=0;
		for (int a=1;a<=10;a++)
		{
			int num=1;
			for(int b=1;b<=a;b++)
			{
				num*=b;
			}
			System.out.println(a+"팩토리얼의 합계 : "+num);
			sum=sum+num;
		}
		System.out.println("팩토리얼의 총 합계 : "+sum);
	}

}
