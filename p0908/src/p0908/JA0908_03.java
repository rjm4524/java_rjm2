package p0908;

public class JA0908_03 {

	public static void main(String[] args) {
		int [] num = new int [3];
		int a = 0;//정수형 타입변수
		
		//배열선언 - 저장할 공간이 생김.
		int [] hour = new int [3];
		int [] minute = new int [3];
		double [] second = new double [3];
		//배열데이터입력
		hour[0] =12;
		minute[0] =12;
		second[0] = 12.25;
		
		
		//객체선언 - 저장할 공간이  생김
		Time t = new Time();
		t.hour=12;
		t.minute=12;
		t.second=12.25;
		
		Time t2 = new Time();
		Time t3 = new Time();
		
		System.out.println(t);
		System.out.println(hour[1]);
		System.out.println(t.hour);
		
		
		
		
		//변수에 데이터 넣기
		int i = 0;
		//배열 선언후 데이터 넣기
		int [] arr = new int [3];
		arr[0] = 10;
		//객체선언 후 데이터 넣기 
		Time time = new Time();
		time.hour = 10;
	
	}

}
