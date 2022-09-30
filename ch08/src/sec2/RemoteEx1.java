package sec2;

public class RemoteEx1 {

	public static void main(String[] args) {
		RemoteControl rc1;
		RemoteControl rc2;
		rc1 = new Television();
		//rc2 = new Audio();
		
		//rc1 = new Audio();
		//rc2 = rc1;
		//rc1 = rc2;
		
		rc1.turnOn();
		rc1.setVolume(8);
		rc1.setMute(true);
		rc1.turnOff();
		
		RemoteControl rc3 = new RemoteControl(){
			public void turnOn() {System.out.println("전원 ON");}
			public void turnOff() {System.out.println("전원 Off");}
			public void setVolume(int volume){
				System.out.println("볼륨 값 : "+volume);
			}
	
	};
		rc3.turnOn();
		rc3.setVolume(8);
		rc3.setMute(true);
		rc3.turnOff();
	
	}
}
