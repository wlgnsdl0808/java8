package sec2;

import sec2.Student;

public class SyetemEx2 {

	public static void main(String[] args) {
		Student st;
		st = new Student(1,"남송윤");
		st = null;
		st = new Student();
		st = new Student(2,"김기태");
		
		System.out.println(st.sno+","+st.sname);
		System.gc();

	}

}
