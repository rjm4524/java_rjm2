package p0907;

import java.util.Arrays;
import java.util.Scanner;

public class JA0907_06_로또 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//순서
		//1.선언
		//2.로또 순차입력
		//3.로또 번호 섞기
		//4.로또 당첨번호 추출
		//5.번호 입력
		//6.직접입력 번호 출력 및 당첨번호 출력
		//7.당첨갯수 확인
		
		
		
		
		//선언
		int[] lotto = new int[45];
		int temp = 0;
		int [] mynum = new int[6];
		int [] winNum = new int [6];
		int count = 0;
		
		//로또번호 순차 입력
		for(int i=0;i<45;i++) {
			lotto[i] = i + 1;
		}//for
		
		//로또 번호 섞기
		for(int i=0; i<300; i ++) {
			int random = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0]=lotto[random];
			lotto[random]=temp; 
			
		}//for
		
		
		//6개의 로또번호 추출
		for(int i=0; i<6; i ++) {
			winNum[i] = lotto[i];
		}//for
		System.out.println(Arrays.toString(winNum));
		//로또 번호 직접 입력
		for(int i=0; i<6; i++) {
			System.out.printf("%d번째번호를 입력하세요. \n",i+1);
			mynum[i] = scan.nextInt();
		}//for
		
		
		System.out.println("-----------------------------");
		System.out.println("----------당첨확인----------");
		System.out.println("-----------------------------");
		//당첨번호 출력 , 직접입력한 번호 출력,당첨갯수
		System.out.print("당첨번호 :" );
		for(int i=0; i<6;i++) {
		System.out.printf("%d ",winNum[i]);
		}
		System.out.println();
		
		//직접번호 출력
		
		System.out.print("입력한 번호 :");
		for(int i=0; i<6; i++) {
			System.out.printf("%d ",mynum[i]);
			
			//당첨개수
		}
		
		for (int i=0; i<6; i++) {
			for (int j=0; j<6; j++) {
				if(winNum[i]==mynum[i]) {
					count++;
					break;
				}
			}
		}
		
		System.out.println("\n당첨갯수 : " + count);
		
 
	}

}
