package sec2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sec1.Student;

public class ListEx2 {
	//학생리스트 선언
	static List<Student> sList = new ArrayList<>(); 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ck = true;
		int i = 0;
		while(ck){
			//작업번호 : 1.학생추가, 2.학생검색, 3.학생수정, 4.학생삭제, 5.학생 명단 출력, 6.작업종료
			System.out.println("작업 번호[1-6]: ");
			int num = sc.nextInt();
			Student s = new Student();
			String name = "없음";
			int jumsu = 0;
			switch(num){
				case 1:
					s = new Student();
					s.setNum(i);
					System.out.println("학생 이름 :");
					name = sc.next();
					s.setName(name);
					System.out.print("학생 점수 :");
					jumsu = sc.nextInt();
					s.setJumsu(jumsu);
					System.out.println();
					++i;
					insert(s);
					break;
				case 2:
					s = new Student();
					System.out.println("검색할 학생 번호 : ");
					int bun = sc.nextInt();
					s = select(bun);
					System.out.println("학생 번호 : "+s.getNum()); 
					System.out.println("학생 이름 : "+s.getName());
					System.out.println("학생 점수 : "+s.getJumsu());
					break;
				case 3:
					s = new Student();
					System.out.println("수정할 학생 번호 : ");
					int no = sc.nextInt();
					s.setNum(no);
					System.out.println("학생 이름 : ");
					s.setName(sc.next());
					System.out.println("학생 점수 : ");
					s.setJumsu(sc.nextInt());					
					update(s);
					break;
				case 4:
					s = new Student();
					System.out.println("삭제할 학생 번호 : ");
					int no2 = sc.nextInt();
					s.setNum(no2);
					delete(s);
					break;
				case 5:
					System.out.println("학생명단\n번호\t이름\t점수");
					for(int a=0;a<sList.size();a++){
						Student r = new Student();
						r = sList.get(a);
						int col1 = r.getNum();
						String col2 = r.getName();
						int col3 = r.getJumsu();
						System.out.println(col1+"\t"+col2+"\t"+col3);
					}
					break;
				default:
					ck=true;
			}
		}
	}
	static void insert(Student s){ //학생추가
		sList.add(s);	//리스트의 요소 추가
	}
	static Student select(int i){  //학생검색
		Student s = new Student();
		s = sList.get(i);	//리스트의 요소 검색
		return s;
	}
	static void update(Student s) { //학생수정
		Student t = new Student();
		t.setNum(s.getNum());
		t.setName(s.getName());
		t.setJumsu(s.getJumsu());
		sList.set(s.getNum(), t);  //리스트의 요소 값 변경
	}
	static void delete(Student s) { //학생삭제
		sList.remove(s.getNum()); //리스트의 요소 제거
	}
}