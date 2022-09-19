package sec1;

public class MemberController {
	Member mem = new Member();
	boolean log = false;
	
	public void join(String id, String password, String name)
	{
		mem.setId(id);
		mem.setPassword(password);
		mem.setName(name);
		System.out.println("회원가입 축하드립니다.");
	}
	public void login(String id,String password)
	{
		if(mem.getId().equals(id) && mem.getPassword().equals(password)){
			log=true;
			System.out.println(id+"님이 로그인 되었습니다.");
		}
		else{
			log=false;
			System.out.println("로그인 실패하셨습니다.");
		}
	} 
	public void info()
	{
		if(log)
		{
			System.out.println("아이디 : "+mem.getId());
			System.out.println("비밀번호 : "+mem.getPassword());
			System.out.println("이름 : "+mem.getName());
		}
		else
		{
			System.out.println("로그인 하지 않으셨습니다.");
		}
	}
}
