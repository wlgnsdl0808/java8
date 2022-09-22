package sec1;

public class Car {
	String company;	//멤버 필드
	String model;
	private String color;
	private int maxSpeed;
	int speed = 200; //초기값 설정
	int rpm;
	static String remark="자동차"; //정적 멤버=공유데이터
	Body body;
	Engine engine;
	Tire tire;
	//[접근제한자] [수정자] 데이터타입  필드명;
	
	//멤버상수
	//final static 데이터타입  상수명 = 값;
	
	public Car() {}
	public Car(String company){ 
		this(company,"k7");
	}
	public Car(String company, String model) {
		this(company,model,"gold");
	}
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	//[접근제한자] 클래스명([매개변수타입] [매개변수명],...) { 
	//	this.필드명 = 매개변수명;
	//	this([매개변수명 | 값]);
	//}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public void carInfo(){ //매개변수X,리턴X
		System.out.println("제조사 : "+company);
	}
	public void carInfo(String company){ //매개변수O,리턴X
		System.out.println("제조사 : "+company);
	}
	public void carInfo(String company, String model){
		System.out.println("제조사 : "+company);
		System.out.println("모델명 : "+model);
	}
	public int calcSpeed(){ //매개변수X,리턴O
		return speed;
	}
	public int calcSpeed(int speed){ //매개변수O, 리턴O
		return speed;
	}
	//[접근제한자] 반환타입  메서드명([매개변수타입] [매개변수명],...) {
	//	실행할 내용;
	//	return 반환변수 또는 값;  -> 반환변수가 가지는 값이나 반환되는 값의 종류가 반환타입과 일치
	//	반환을 하지 않는 경우는 반환타입이 void
	//}
}