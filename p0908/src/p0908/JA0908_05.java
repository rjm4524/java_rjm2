package p0908;

public class JA0908_05 {

	public static void main(String[] args) {
		//학생성적 프로그램
		StuScore s1 = new StuScore(); //객체 선언
		StuScore s2 = new StuScore();//객체 선언
		s1.stuNo = 1;
		s1.name = "류진민";
		s1.kor = 100;
		s1.eng = 100;
		s1.math = 100;
		s1.total();
		s1.avg();
		s2.stuNo = 2;
		s2.name = "김철수";
		s2.kor = 0;
		s2.eng = 0;
		s2.math = 0;
		s2.total();
		s2.avg();
		
		s1 = s2;
		s2.name = "이순신";
		
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
				s1.stuNo,s1.name,s1.kor,s1.eng,s1.math,s1.total,s1.avg);
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
				s2.stuNo,s2.name,s2.kor,s2.eng,s2.math,s2.total,s2.avg);
		
	}

}
