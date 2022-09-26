package sec2;

public class SmartPhone extends CellPhone {
	String appName;
	
	public void appStrart(String appName){
		System.out.println(appName+"을 시작합니다.");
	}
	public void appEnd(String appName){
		System.out.println(appName+"을 종료합니다.");
	}
}
