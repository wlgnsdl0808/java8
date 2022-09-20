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
		return this.sum;
	}
	public int calcAvg(){
		this.avg = this.sum / 3;
		return this.avg;
	}
	public void calcHak(){
		if(this.avg>=90){
			System.out.println("A");
		}
		else if(this.avg>=80){
			System.out.println("B");
		}
		else if(this.avg>=70){
			System.out.println("C");
		}
		else
		{
			System.out.println("D");
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
