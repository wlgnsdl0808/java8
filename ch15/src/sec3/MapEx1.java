package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
//한 건의 데이터를 항목이름의 중복없이 항목이름과 해당 값을 가져올 때 사용
public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, String> map2 = new Hashtable();
		Map<String, Integer> map3 = new TreeMap();
		Properties map4 = new Properties();

		//해당 키와 값만 전송
		map1.put("num", 1);
		map1.put("kor", 100);
		map1.put("eng", 90);
		map1.put("mat", 70);
		System.out.println(map1);
		System.out.println(map1.get("num"));
		if(map1.containsKey("his")){
			System.out.println("해당 키가 존재합니다.");
		}
		if(map1.containsValue(100)){
			System.out.println("해당 값이 존재합니다.");
		}
		
		
		map2.put("name", "kim");
		map2.put("height", "174");
		map2.put("weight", "78.6");
		System.out.println(map2);
		System.out.println(Integer.parseInt(map2.get("height")));
		map2.remove("height");
		System.out.println(map2.get("weight"));
		
		map3.put("a", 2);
		map3.put("b", 90);
		map3.put("c", 100);
		map3.put("d", 80);
		System.out.println(map3);
		System.out.println("국어 :"+map3.get("b"));
		
		//Properties는 항목이름과 값으로 지정
		map4.setProperty("name", "park");
		map4.setProperty("kor", "100");
		map4.setProperty("eng", "80");
		System.out.println(map4);
		System.out.println("이름 : "+map4.getProperty("name"));
	}
}