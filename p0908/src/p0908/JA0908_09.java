package p0908;

public class JA0908_09 {

	public static void main(String[] args) {
		// Spade-13장, Heart-13장, Diamond-13장, Clover-13장
		// 52장
		// 배열선언
		Card[] c = new Card[52];
		String[] shape = {"Spade","Heart","Diamond","Clover"};
		
			for (int i = 0; i < c.length; i++) {
				c[i] = new Card();// 객체선언
				c[i].number = (i%13) + 1;
				c[i].kind = shape[i/13];
				//shape : 0~12:Spade,13~25:Heart,26~38:Diamond,39~51:Clover
				}
			
			
		

		
			for (int i = 0; i < c.length; i++) {
				System.out.printf("%d,%s \n",c[i].number,c[i].kind);
				
			}
			
		

		// 배열
//		int[] num = new int [13];
//		//1-13을 입력해보세요.
//		for(int i=0; i<13; i ++) {
//			num[i] = i+1;
//			System.out.println(num[i]);
//		}
//		
//		for(int i=0; i<13; i++) {
//			System.out.printf("%d ",num[i]);
//		}

	}// main

}// class
