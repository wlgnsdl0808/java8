package sec1;

public class ClassEx0 {

	public static void main(String[] args) {
		Generic<Student> s1 = new Generic<Student>();
		Generic<General> g1 = new Generic<General>();
		Generic<Salary> s2 = new Generic<Salary>();
		Generic<Student> s3 = new Generic<>();
		
		
	}

}
class Generic<T>{
	T a;	//일반화(General)=볌용화 과정을 거처 어떤 객체든지 활용할 수 있는 공용 데이터타입을 만드는 과정
}
class Member {
	General g;
	Student s1;
	Salary s2;
}
class General {
	
}
class Student {
	
}
class Salary {
	
}
