package sec4;

public class Ex4 {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			for(int a=0;a<=i;a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");
		for(int i=0;i<=4;i++)
		{
			for(int a=5;a>i;a--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
