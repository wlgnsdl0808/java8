package sec2;

public class DmbPhoneEx {

	public static void main(String[] args) {
		CellPhone p1 = new CellPhone();
		CellPhone p2 = new DmbPhone();
		//DmbPhone p3 = new CellPhone();
		DmbPhone p4 = new DmbPhone();
		System.out.println(p1.COMPANY);
		System.out.println(p2.COMPANY);
		System.out.println(p4.COMPANY);
		p1.powerOn();
		p2.powerOn();
		p4.powerOn();
		
		p1 = p4;
		
		DmbPhone p6;
		p6 = (DmbPhone) p2;
	}

}
