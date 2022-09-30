package sec3;

public class CarEX {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		for(int i=1;i<=10;i++){
			int errorLocation = car1.run();
			
			switch(errorLocation){
				case 1:
					System.out.println("앞쪽 왼쪽 바퀴Michelin Tire로 교체");
					car1.frontLeftTire = new MichelinTire(12,"앞왼쪽");
				case 2:
					System.out.println("앞쪽 오른쪽 바퀴 Hankook Tire로 교체");
					car1.frontLeftTire = new HankookTire(4,"앞왼쪽");
				case 3:
					System.out.println("뒤쪽 왼쪽 바퀴 Kumho Tire로 교체");
					car1.frontLeftTire = new KumhoTire(4,"뒤왼쪽");
				case 4:
					System.out.println("뒤쪽 오른쪽 바퀴 Hankook Tire로 교체");
					car1.frontLeftTire = new HankookTire(6,"뒤오른쪽");
					break;
			}
		}
	}

}
