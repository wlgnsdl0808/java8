package sec1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class CollectionEx4 {

	public static void main(String[] args) {
		Map map1 = new HashMap();
		map1 = new Hashtable();
		map1 = new TreeMap();
		map1 = new Properties();
		
		HashMap map2 = new HashMap();
		
		method1(map1);
		method1(map2);
		//method2(map1);
		method2(map2);

		
	}
	static void method1(Map m){}
	static void method2(HashMap m){}

}
