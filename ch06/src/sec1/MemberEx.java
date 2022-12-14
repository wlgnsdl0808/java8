package sec1;

public class MemberEx {

	public static void main(String[] args) {
		//클래스명 인스턴스명 = new 생성자함수()
		Member mem1 = new Member();
		mem1.setId("kjh");
		mem1.setPassword("1234");
		mem1.setName("김지훈");
		mem1.setAddress("김포");
		mem1.setTel("010-1234-1234");
		mem1.setReg_date("");
		
		System.out.println("아이디 : "+mem1.getId());
		System.out.println("비밀번호 : "+mem1.getPassword());
		System.out.println("이름 : "+mem1.getName());
		System.out.println("주소 : "+mem1.getAddress());
		System.out.println("전화번호 : "+mem1.getTel());
		System.out.println("가입일 : "+mem1.getReg_date());
		
		Member mem2 = new Member("kyj","1004");
		Member mem3 = new Member("kim","1005","김");
		Member mem4 = new Member("ji","1003","지","김");
		
		System.out.println(mem2.getId());
		System.out.println(mem2.getPassword());
		System.out.println(mem3.getName());
		
		MemberController mc = new MemberController();
		mc.join("kjh","1004","김지훈");
		mc.info();
		mc.login("kjh","1004");
		mc.info();
		
	}

}
