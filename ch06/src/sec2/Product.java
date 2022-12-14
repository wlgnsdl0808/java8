package sec2;

public class Product {
	
	String pid; //제품아이디
	String pname; //제품명
	int amount=0;	//제품수량
	int price;	//제품가격
	int sum=0;
	String img; //제품이미지
	
	
	
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Product(){}
	
	public Product(String pid, String pname, int amount){
		this.pid = pid;
		this.amount = amount;
	}
	
	public Product(String pid, String pname, int amount, int price){
		this.pid = pid;
		this.pname = pname;
		this.amount = amount;
		this.price = price;
	}
	
	public int calcMoney(){
		sum = this.amount * this.price;
		return sum;
	}
	public void calcRank(){
		if(this.price>=1000000)
			System.out.println("고가");
		else if(this.price>=50000)
			System.out.println("중저가");
		else
			System.out.println("저가");
	}
	public void printImg(){
		System.out.println("이미지");
	}
	
	public void printProduct(){
		System.out.println("제품 아이디 : "+this.pid);
		System.out.println("제품 수량 : "+this.amount);
		System.out.println("제품 가격 : "+this.sum);
		System.out.println("제품 이미지 : "+this.img);
	}
}
