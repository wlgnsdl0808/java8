package sec1;

public class CarEx {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.company = "현대자동차";
		car1.model = "그랜저";
		System.out.println("제조사 : "+car1.company);
		System.out.println("자동차명 : "+car1.model);
		car1.setColor("silver");
		car1.setMaxSpeed(500);
		System.out.println("자동차색 : "+car1.getColor());
		System.out.println("최고속도 : "+car1.getMaxSpeed());
		
		System.out.println("현재속도 : "+car1.speed);
		car1.speed = 50;
		System.out.println("현재속도2 : "+car1.getSpeed());
		car1.setSpeed(80);
		System.out.println("현재속도3 : "+car1.getSpeed());
		
		Car car_0 = new Car();
		Car car_1 = new Car("기아자동차");
		Car car_2 = new Car("기아자동차","K7");
		System.out.println("차종 : "+car_1.model);
		System.out.println("색상 : "+car_2.getColor());
		System.out.println("비고0 : "+car_0.remark);
		System.out.println("비고1 : "+car_1.remark);
		System.out.println("비고 2 : "+car_2.remark);
		car_2.remark = "자전거";
		System.out.println("비고0 : "+car_0.remark);
		System.out.println("비고1 : "+car_1.remark);
		System.out.println("비고 2 : "+car_2.remark);
		Car.remark = "자동차";
		System.out.println("비고 : "+Car.remark);
		System.out.println("비고0 : "+car_0.remark);
		System.out.println("비고1 : "+car_1.remark);
		System.out.println("비고 2 : "+car_2.remark);
	}
}