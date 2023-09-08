package p0908;

public class JA0908_10 {
	
	//int result =0;//인스턴스

	public static void main(String[] args) {
		int result = 0;//지역변수
		
		
		System.out.println(add(10,3));
		System.out.println(add(222,234));
		System.out.println(add(21,99));
		System.out.println(add(787,676));
		System.out.println(add(1127,458));

	}//main
	//메소드 정의
	static int add(int a, int b) {
		int result = 0;
		result = a+a+b;
		return result;
				
	}//add

}//class
