package sec2;

public class CarEx {

	public static void main(String[] args) {

		Car car1 = new Car("롤스로이스","가솔린",4000);
		car1.bootUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		System.out.println("현재 속도 : "+car1.speedInfo());
		car1.speedPrint();
		car1.speedDown();
		car1.speedDown();
		car1.speedDown();
		car1.speedDown();
		System.out.println("현재 속도 : "+car1.speedInfo());
		car1.speedPrint();
		car1.speedDown();
		for(int i=0;i<100;i++){
			car1.speedDown();
		}
		System.out.println("현재 속도 : "+car1.speedInfo());
		car1.bootOff();
		
		Car car2;
	}

}
