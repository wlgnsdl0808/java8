package sec2;

public class Account {
	String number;//계좌번호
	String name;//계좌주
	int a=0; //잔액
	int b; //입출금액
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int runDeposit(){
		this.a = this.a+this.b;
		System.out.println("입금 : "+this.b);
		return this.a;
	}
	public int runWithdraw(){
		if(this.a>=this.b){
			this.a = this.a-this.b;
			System.out.println("출금 : "+this.b);
		}
		else{
			System.out.println("잔액이 부족합니다.");
		}
		return this.a;
	}
	public void runBalance(){
		System.out.println("잔액조회 : "+this.a);
	}
	public void printAccount(){
		System.out.println("계좌번호 : "+this.number);
		System.out.println("계좌주 : "+this.name);
		System.out.println("잔액 : "+this.a);
	}
}
