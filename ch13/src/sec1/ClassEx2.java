package sec1;

public class ClassEx2 {
	public static void main(String[] args) {
		Moving<String, Integer> m1 = new Moving();
		m1.key = "age";
		m1.value = 40;
		Moving<Car, Tire> m2 = new Moving<>();
		
	}
}
class Moving<K, V>{	//key, value 를 타입에서 활용 가능함(=Dictionary) 
	K key;
	V value;
}
class Car{
	
}
class Tire{
	
}