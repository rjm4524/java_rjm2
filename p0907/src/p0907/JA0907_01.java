package p0907;



public class JA0907_01 {

	public static void main(String[] args) {
		int[][] num = new int[5][3]; // 3*i+(j+1)
		
		//입력
		for(int i=0;i<5;i++) {
			for(int j=0; j<3; j++) {
				num[i][j] = 3*i+(j+1);
			}
		
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0; j<3;j++) {
				System.out.print(num[i][j] + "\t ");
			}
			System.out.println();
		}
		System.out.println();
		
		
//		Scanner scan = new Scanner(System.in);
//		//1차원 배열 ------------------------
//		int[] score = new int[10];
//		for(int i=0;i<score.length;i++) {
//			score[i] = i+1;
//		}
//		//출력
//		for(int i=0; i<score.length; i++) {
//			System.out.println(score[i]);
//		}
		//score 1-10까지 숫자를 입력, 출력하세요.
		
		

	}//main

}//class
