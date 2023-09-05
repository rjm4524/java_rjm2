package p0904;

public class JA0904_11 {

	public static void main(String[] args) {
		//1부터 100까지의 합을 출력하시오.
		//1부터 100까지의 합에서 합이 200을 넘는 떄는 언제일까요? i와 sum을 출력하시오.
		
		//1. 1부터 100까지 합을 구함
		//2. 조건문을 사용해서 sum 200이상일때를 구함.
		
		int i=0;
		int x=0;
		
		for(i=0;i<=100;i++) {
			x = x + i;
			if(x>=200) {
				break;
			}
		}
		System.out.println(i);
		
			
			
		
		
		
		
		
//		
//		int x = 0;
//		int i=0;
//		
//	
//		for(i=1;i<=100;i++) {
//		
//			x = x +i;
//		}
//		System.out.printf("1부터 %d까지 합계 : %d \n",i-1,x);
//		
		
		
		
		
		

//		int sum=0;
//	
//		
//		for(i=1;i<=100;i++) {
//			System.out.println(i);
//			sum = sum + i;
//		}
//		
//		System.out.println(sum);
//		System.out.println("for문 밖 sum :" + sum);
//		
		

	}//main

}//class
