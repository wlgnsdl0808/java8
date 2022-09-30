package sec3;

public class HankookTire extends Tire{
	public HankookTire(int maxRotation,String location){
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location+" Hankook Tire"+(maxRotation-accumulatedRotation));
			return true;
		}
		else{
			System.out.println("*******"+location+" Hankook Tire 펑크****");
			return false;
		}
	}
}
