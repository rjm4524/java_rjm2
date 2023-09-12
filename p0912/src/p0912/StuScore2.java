package p0912;

public class StuScore2 {
	
	
	StuScore2(){}
	
     StuScore2(int stuNo, String name, int kor, int eng, int math) {
		StuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
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
