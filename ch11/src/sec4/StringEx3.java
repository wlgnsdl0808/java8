package sec4;

public class StringEx3 {

	public static void main(String[] args) {
		String str1 = new String("");
		str1+="김지은";
		str1+=" ";
		str1+="박평화";
		str1+=" ";
		str1+="강병수";
		System.out.println("출력 1 : "+str1);
		
		StringBuffer str2 = new StringBuffer();
		str2.append("김지은");
		str2.append(" ");
		str2.append("박평화");
		str2.append(" ");
		str2.append("강병수");
		System.out.println("출력 2 : "+str2.toString());
		
		str2.replace(0, 3, "김지훈");
		System.out.println("출력 3 : "+str2.toString());
		
		StringBuilder str3 = new StringBuilder();
		str3.append("김지은");
		str3.append(" ");
		str3.append("박평화");
		str3.append(" ");
		str3.append("강병수");
		str3.insert(0, "김지훈 ");
		System.out.println("출력 4 : "+str3.toString());
		System.out.println(str3.substring(0,2));
		System.out.println(str3.reverse());
		str3.reverse();
		str3.delete(0, 4);
		System.out.println("출력 5 : "+str3.toString());

	}

}
