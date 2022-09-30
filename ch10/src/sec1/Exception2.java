package sec1;

public class Exception2 {

	public static void main(String[] args) {
		int arr[] = new int[3];
		int i=0;
		while(i<=3){
			try{
			arr[i] = i*10-5;
			i++;
			System.out.println(arr[i]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배정된 배열의 요소수보다 더 많은 데이터를 요구하였음");
			e.printStackTrace();
		} catch(Exception e){
			System.out.println("원인불명");
			e.printStackTrace();
		} finally{
			System.out.println("종료");
		}
		}
	}

}
