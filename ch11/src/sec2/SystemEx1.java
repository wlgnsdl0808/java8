package sec2;

public class SystemEx1 {

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager(){
			public void checkexit(int status){
				if(status != 5){
					throw new SecurityException();
				}
			}
		});
		
		for(int i=0;i<10;i++){
			System.out.println();
			try{
			System.exit(i);
			} catch(SecurityException e){
				System.out.println("종료");
			}
		}
		
	}

}
