package sec1;

public class UserController extends MemberController{

	@Override
	public void join(String id, String password, String name){
		System.out.println("아이디 : "+id);
	}

}
