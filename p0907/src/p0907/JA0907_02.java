package p0907;

import java.util.Scanner;

public class JA0907_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// score[5][5] -> 1-25까지 숫자를 입력해서 2차원의 형태로 출력하시오.
		int[][] score = new int[5][5];
		int n = 0;
		int[] temp = new int[25];

		// 1차원 배열 temp에 1-25까지 숫자를 입력하세요.

		for (int i = 0; i < 25; i++) {
			temp[i] = i + 1;
		}
		// 번호섞기★■
		for (int i = 0; i < 200; i++) {
			int random = (int) (Math.random() * 25);
			n = temp[0];
			temp[0] = temp[random];
			temp[random] = n;

		}
		// temp 배열 출력
//		for(int i=0; i<25; i++) {
//			System.out.print(temp[i] + " ");
//		}
//		System.out.println();

		// 2차원 배열 입력 >> 2차원배열에 temp배열을 입력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				score[i][j] = 5 * i + (j + 1); // 1-25까지
				score[i][j] = temp[(5 * i) + j];
			}
		}

		while (true) {
			// 2차원 출력
			System.out.println("           [숫자맞추기 게임] ");
			System.out.printf(" |\t0\t1\t2\t3\t4\n");
			System.out.println("------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.print(i + "|\t");
				for (int j = 0; j < 5; j++) {
					System.out.print(+score[i][j] + "\t");
				}
				System.out.println();
			} // for

			System.out.println("------------------");
			System.out.println("원하는 숫자를 입력하세요.");
			int number = scan.nextInt();
			
			
			//모든 좌표값과 number값을 비교
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(score[i][j]==number) {
						score[i][j]=0;
						break;
						
					}
				}
			}
			
			//좌표를 넣어서 해당값을 0으로 변환
			//System.out.println("좌표를 입력하세요.(행)");
			//int input1 = scan.nextInt();
			//System.out.println("좌표를 입력하세요.(열)");
			//int input2 = scan.nextInt();
			
			//좌표 위치값을 0으로 변경
			//score[input1][input2] = 0;
			
			
			
		} // while

	}// main

}// class
