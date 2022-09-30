package sec2;

import java.util.Objects;

public class UtilObjectsEx4 {

	public static void main(String[] args) {
		String data1 = "정병진";
		String data2 = null;
		
		System.out.println(data1.toString());
		try{
			System.out.println(data2.toString());
		} catch(NullPointerException e){
			System.out.println("null");
		}
		System.out.println("\n");
		System.out.println(Objects.toString(data1));
		System.out.println(Objects.toString(data2));
		System.out.println(Objects.toString(data2, "값이 없음"));

	}

}
