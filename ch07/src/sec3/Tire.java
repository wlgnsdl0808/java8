package sec3;

public class Tire {
	//맴버 필드
	public int maxRotation; //최대 회전수(타이어 수명)
	public int accumulatedRotation; // 누적 회전수;
	public String location;
	//생성자
	public Tire(int maxRotation, String location){
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location+" Tire"+(maxRotation-accumulatedRotation));
			return true;
		}
		else{
			System.out.println("*******"+location+" Tire 펑크****");
			return false;
		}
	}
}
