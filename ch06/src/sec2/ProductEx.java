package sec2;

public class ProductEx {

	public static void main(String[] args) {

		Product pro = new Product("a01","냉장고",3,80000);
		
		pro.calcMoney();
		pro.calcRank();
		pro.printProduct();
		
	}

}
