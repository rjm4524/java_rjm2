package p0912;

public class Stu extends Car{
	
	Stu() {}
	Stu(int StuNo,String name, int kor , int eng , int math) {
		this.StuNo = StuNo;
		this.name = name;
		this.kor= kor;
		this.eng = eng;
		this.math = math;
		this.total=kor+eng+math;
		this.avg = total/3.0;
		
		
		
	}
	
	int StuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

}
