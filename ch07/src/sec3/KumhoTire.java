package sec3;

public class KumhoTire extends Tire {
	public KumhoTire(int maxRotation,String location){
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location+" Kumho Tire"+(maxRotation-accumulatedRotation));
			return true;
		}
		else{
			System.out.println("*******"+location+" Kumho Tire 펑크****");
			return false;
		}
	}
}

