package p0914;

public class StuScore {
	StuScore() {}
	
	private int stuNo;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private  int total;
	private double avg;
	private int rank;

	public StuScore(int stuNo, String name) {

		this.stuNo = stuNo;
		this.name = name;

	}

	public StuScore(int stuNo, String name, int kor, int eng, int math) {

		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
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

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}
