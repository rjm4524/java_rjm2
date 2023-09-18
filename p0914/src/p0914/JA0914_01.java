package p0914;

public class JA0914_01 {

	public static void main(String[] args) {
		
		//1.기본생성자를 호출해서 값을 입력받는 방법
		StuScore s = new StuScore();
		s.setStuNo(1);
		System.out.println("학생번호 : "+s.getStuNo());
		
		
		
		
//		s.setStuNo(1);
//		s.setName("류진민");
//		s.setKor(100);
//		s.setEng(100); 
//		s.setMath(100);
//		s.setTotal(s.getKor()+s.getEng()+s.getMath()); 
//		s.setAvg(s.getTotal()/3.0);
		//생성자 - 객체생성때 초기화메소드 - 데이터입력
		
		
		//2.매개변수 생성자
		StuScore s2 = new StuScore(1,"류진민",100,100,100);
		System.out.println("학생번호 : "+s2.getStuNo());
		

	}//main

}//class
