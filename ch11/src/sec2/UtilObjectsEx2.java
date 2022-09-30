package sec2;

import java.util.Objects;

public class UtilObjectsEx2 {

	public static void main(String[] args) {
		Student s1 = new Student(1, "김기태");
		Student s2 = new Student(2, "강병수");
		Student s3 = new Student(3, "고유진");
		Student s4 = s1;
		System.out.println(s1);
		System.out.println(s4);
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s1));
		System.out.println(s1.sname);
		System.out.println(s1.sname);
		s1.sname="김도연";
		System.out.println(s4.sname);
		
		Student s5 = new Student(s1.sno, s1.sname);
		System.out.println(s1);
		System.out.println(s5);
		}

}
