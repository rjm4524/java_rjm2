package p0911;

public class Calculator {

	public static void main(String[] args) {
		Cal1 c1 = new Cal1();
		c1.value = 10;
		System.out.println(c1.value);
		Cal2 c2 = new Cal2(10);
		System.out.println(c2.value);

	}//main

}//class


class Cal1{
	int value;//인스턴스 변수 - 객체선언후 참조변수명.변수명
	
}//Cal1

class Cal2{
	int value;//인스턴스 변수 - 객체선언 후 참조변수명. 변수명
	Cal2(){}//기본생성자 - 기본생성자가 아닌 생성자가 있으면 컴파일이 자동으로 기본생성자를 만들지 않음.
	Cal2(int x){ //매개변수 1개가있는 생성자 (기본생성자 생성 x)
		value = x;
		
	}
}