package sec4;

import java.util.regex.Pattern;

//Pattern(패턴) : regEX = 정규표현식
public class PatternEx1 {

	public static void main(String[] args) {
		//(02)-1234-1234 또는 (010)-123-1234/(010)1234-1234 또는 (031)-1234-1234
		String regExp = "(02|031|010)-\\d{3,4}-\\d{4}";
		String data1 = "(02)-1234-1234";
		String data2 = "042-1234-1234";
		String data3 = "010-1234-1234";
		String data4 = "031-123-1234";
		boolean p1 = Pattern.matches(regExp, data1);
		System.out.println(data1+"은 형식에 맞습니까? "+p1);
		System.out.println(data2+"은 형식에 맞습니까? "+Pattern.matches(regExp, data2));
		System.out.println(data3+"은 형식에 맞습니까? "+Pattern.matches(regExp, data3));
		System.out.println(data4+"은 형식에 맞습니까? "+Pattern.matches(regExp, data4));
		
		regExp = "\\w+@\\w+(\\.\\w+)?";
		data1 = "kbs@google.com";
		data2 = "kkt@navercom";
		data3 = "thjoeun.co.kr";
		
		System.out.println(data2+"은 형식에 맞습니까? "+Pattern.matches(regExp, data1));
		System.out.println(data3+"은 형식에 맞습니까? "+Pattern.matches(regExp, data2));
		System.out.println(data4+"은 형식에 맞습니까? "+Pattern.matches(regExp, data3));
	}

}