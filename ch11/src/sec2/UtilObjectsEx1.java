package sec2;

import java.util.Objects;

public class UtilObjectsEx1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sno = 1;
		Student s2 = new Student();
		s1.sno = 2;
		Student s3 = new Student();
		s1.sno = 1;

		int comp = Objects.compare(s1, s2, new StudnetComparator());
		if(comp==1){
			System.out.println("s1이 더 큽니다.");
		} else if(comp==0){
			System.out.println("s1과 s2가 같습니다.");
		}else{
			System.out.println("s1이 더 작습니다.");
		}
	}

}
