package sec3;

public class MotorCycle {
	
	public MotorCycle(){}
	Tire frontTire = new Tire(8,"앞");
	Tire backTire = new Tire(7,"뒤");
	
	public int run(){
		System.out.println("자동차가 달립니다.");
		if(frontTire.roll()==false) {stop(); return 1;}
		if(backTire.roll()==false) {stop(); return 2;}
		return 0;
	}
	public void stop(){
		System.out.println("자동차가 멈춥니다.");
	}
	
	
}
