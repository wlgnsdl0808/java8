package sec3;

public class SingletoneEx {

	public static void main(String[] args) {
		//Singletone single1 = new Singletone();
		Singletone single1 = Singletone.getInstance();
		Singletone single2 = Singletone.getInstance();
		Singletone single3 = Singletone.getInstance();
		System.out.println(single1);
		System.out.println(single2);
		System.out.println(single3);
		if(single1==single2){
			System.out.println("single1은 single2입니다.");
		}
		else{
			System.out.println("single1은 single2는 다른 객체입니다..");
		}
		
	}

}
