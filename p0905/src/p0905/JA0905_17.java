package p0905;

import java.util.Scanner;

public class JA0905_17 {

	public static void main(String[] args) {
		// 1-100 랜덤숫자를 생성해서 맞추는 프로그램을 구현하시오.
		//2. 입력
		//3. 비교
		//4. 출력
		
		Scanner scan = new Scanner(System.in);
		int[] arrnum = new int[10];
		int random = 0;
		int count = 0;
		int number = 0;
		
		random = (int)(Math.random()*100)+1;
		
		while(true) {
			System.out.println("숫자를 입력하세요.");
			number = scan.nextInt();
			arrnum[count] = number;
			System.out.println("입력한 숫자 :" + number);
			if(number==random) {
				System.out.println("정답입니다.");
				break;
			}
			
			count++;
			
			if (count>9) {
				System.out.println("입력 횟수를 초과하셨습니다. 프로그램을 종료합니다.");
				count--;
				break;
				
			}
			
		}
		
		for(int i=0;i<10;i++) {
			if(i==0) {
				System.out.print(arrnum[i]);
				continue;
			}
			System.out.print(arrnum[i]+" ");
		}
	
				
		
		
		
		
		
		
//		int[] arrnum = new int[10]; //입력된 숫자 저장배열
//		int number = 0; //입력한 숫자
//		int count = 0; //도전횟수
//		int random = 0; //랜덤숫자
//		
//		random = (int)(Math.random()*100)+1; //1-100 : 100개의 랜덤숫자를 생성
//		
//		while(true) {
//			System.out.println((count+1)+"번째 숫자를 입력하세요.");
//			System.out.println("숫자를 입력하세요.");
//			number = scan.nextInt();
//			arrnum[count] = number; //배열에 입력한 숫자저장
//			System.out.println("입력한 숫자 : " +number);
//			count ++;
//			if(count>9) { //입력한 횟수가 10번인지 확인
//				System.out.println("10번 완료. 프로그램을 종료합니다.");
//				count--;
//				break;
//				
//			
//			
//			}
//			
//			
//			
//		}
//		
		//입력한 숫자 출력
		//도전횟수 출력
		//랜덤숫자 출력

	}

}
