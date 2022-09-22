package sec2;

import java.util.Scanner;

public class ProductEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Product pro = new Product();
		System.out.print("제품코드 : ");
		pro.setPid(sc.next());
		System.out.print("제품명 : ");
		pro.setPname(sc.next());
		System.out.print("제품수량 : ");
		pro.setAmount(sc.nextInt());
		System.out.print("제품가격 : ");
		pro.setPrice(sc.nextInt());
		System.out.print("이미지 : ");
		pro.setImg(sc.next());
		pro.calcMoney();
		pro.calcRank();
		pro.printProduct();
		
	}

}
