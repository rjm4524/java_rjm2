	package p0922;

public class StuScore {
	
	
	
	static int count =1;
	{//초기화 블럭
		
		this.stuNum = count;
		count ++;
		
		
	}
	
	



	public StuScore () {} //기본생성자
	
	
	
	public StuScore(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3.0;
	}

//전체 생성자
	public StuScore(int stuNum, String name, int kor, int eng, int math, int total, double avg ,int rank) {
		this.stuNum = stuNum;//stuNum의 입력이 2번 
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.rank = rank;
	}

	private int stuNum;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private int rank;
	
	
	
	public int getRank() {
		return rank;
	}



	public void setRank(int rank) {
		this.rank = rank;
	}



	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
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
		if(kor>0 && kor<=100) {
			this.kor = kor;
		}else if(kor<0) {
			
			this.kor = 0;
		}else {
			this.kor = 100;
		}
		
		
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
	private double avg;

}