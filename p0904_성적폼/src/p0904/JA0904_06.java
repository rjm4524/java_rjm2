package p0904;

public class JA0904_06 {

	public static void main(String[] args) {
		double temp = Math.random(); // Math.round(반올림) , Math.ceil(올림) , Math.floor(버림)
		int num = (int)(Math.random()*10)+1;
		int num2 = (int)(Math.random()*100)+1;
		//1~100까지
		int num3 = (int)(Math.random()*10);
		//0~9까지
		int num4 = (int)(Math.random()*50)+1;
		//1부터 50까지
		int num5 = (int)(Math.random()*45)+1;
		//1~45까지
		int num6 = (int)(Math.random()*10000);
		//1~9999까지
		int num7 = (int)(Math.random()*20)+1;
		//1~20까지
		
		System.out.println("랜덤 정수값 :" + num7);
		System.out.println("난수값 :" + temp);
		

	}//main	

}//class
