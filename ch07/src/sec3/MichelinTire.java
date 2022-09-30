package sec3;

public class MichelinTire extends Tire {
	public MichelinTire(int maxRotation,String location){
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation){
			System.out.println(location+" Michelin Tire"+(maxRotation-accumulatedRotation));
			return true;
		}
		else{
			System.out.println("*******"+location+" Michelin Tire 펑크****");
			return false;
		}
	}
}
