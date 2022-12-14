package sec2;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
	int sum;
	int avg;
	
	public Student(){}
	
	public Student(String name){
		this.name = name;
	}
	public Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getName() {
		System.out.println("이름 : "+name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int calcTot(){
		this.sum = this.kor + this.eng + this.mat;
		System.out.println("총점 : "+sum);
		return this.sum;
	}
	public int calcAvg(){
		this.avg = this.sum / 3;
		System.out.println("평균 : "+avg);
		return this.avg;
	}
	public void calcHak(){
		if(this.avg>=90){
			System.out.println("학점 : A");
		}
		else if(this.avg>=80){
			System.out.println("학점 : B");
		}
		else if(this.avg>=70){
			System.out.println("학점 : C");
		}
		else
		{
			System.out.println("학점 : D");
		}
	}
	public void calcRes(){
		if(this.avg>=80){
			System.out.println("합격");
		}
		else{
			System.out.println("불합격");
		}
	}
}
