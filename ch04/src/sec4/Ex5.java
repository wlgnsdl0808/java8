package sec4;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		boolean run =true;
		int money=0, balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run){
			System.out.println("-------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");
		}
		int num = scanner.nextInt();
		switch(num){
		case 1:
			System.out.println("예금액> ");
			money= scanner.nextInt();
			balance+=money;
			break;
		case 2:
			System.out.println("출금액> ");
			money= scanner.nextInt();
			balance-=money;
		case 3:
			System.out.println("잔고> "+balance);
		case 4:
			System.out.println("프로그램 종료");
			run=false;
		default:
			System.out.println("");
	}
	}
}
