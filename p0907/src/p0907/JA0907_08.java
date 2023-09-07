package p0907;

public class JA0907_08 {

	public static void main(String[] args) {
		String str="123";//이미 정해진 문자열 123을 정수형으로 바꿔서 덧셈이 가능하게함.
		String str2 = "100";
				
		int num = Integer.parseInt(str)	;
		int num2 = Integer.parseInt(str2);
		
		System.out.println("문자열 더하기" + (str + str2));
		System.out.println("정수 더하기" + (num+num2));
		
		String s = num+""; //정수를 문자로 바꾸는것
		//정수형 n에 1을 더해서 방에 2를 입력
        int start = 1;
        
        start = start +1;   //100번 반복해도 1개의 방만 만들어짐.    
		
        s= s+"안녕"; //100번 반복하면 100개의 방이 만들어짐
		//int [] num = {1,2,3,4,5};
//		//기본for문
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
//		
//		//단순 for문
//		int n=0;
//		for(int i:num) {
//			
//			System.out.println(n+"번째 방 :"+i);
//			n++;
//		}

	}

}
