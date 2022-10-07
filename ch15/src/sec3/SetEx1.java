package sec3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new TreeSet<Integer>();
		set1.add("김연정");
		set1.add("남송윤");
		set1.add("강병수");
		set1.add("김기태");
		set1.add("남송윤");
		set1.add("유광현");
		set1.add("김기태");
		System.out.println(set1);
		System.out.println("찾을 사람 입력");
		String name = sc.next();
		if(set1.contains(name)){ //해당 데이터 존재 유무
			System.out.println("해당 데이터가 존재합니다.");
		}
		System.out.println("건수 : "+set1.size());
		if(set2.isEmpty()){	//객체의 널값 비교
			System.out.println("set2가 비어 있습니다.");
		}
		set1.remove("김기태");		//특정 요소 삭제
		set1.clear();  //비우기=모든 요소 삭제
		
		set2.add(8);
		set2.add(10);
		set2.add(7);
		set2.add(4);
		set2.add(6);
		set2.add(5);
		
		Set<Integer> set3 = new TreeSet<Integer>(Arrays.asList(9,3,6,8,7));
		//Set은 인덱스에 의한 접근이 불가함
		//for(int i=0;i<set3.size();i++){
			//System.out.println(set3.get(i)); 
		//}
		//Iterator를 활용하여 접근이 가능함
		Iterator iter = set3.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+", ");
		}
	}
}