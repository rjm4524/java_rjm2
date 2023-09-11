package p0911;

public class JA0911_06 {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x :" +d.x);
		change(d.x);
		System.out.println("2 d.x :"+d.x);

	}//main
	
	//클래스 메소드 - 객체선언 x 클래스명.변수명
	static void change(int x) {
		x = 1000;
		System.out.println("매소드 x :" + x);
		
	}
}//class

