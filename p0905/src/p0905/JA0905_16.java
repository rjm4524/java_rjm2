package p0905;

import java.util.Scanner;

public class JA0905_16 {

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
		
	
	//1. 1-100랜덤숫자 생성
		random = (int)(Math.random()*100)+1;
		System.out.println("랜덤숫자 컨닝 : "+random );
		 //카운트 변수 (숫자갯수를 입력하는 메소드)
		//무한반복
		while(true) {
			
			System.out.println("숫자를 입력하세요.");
			number = scan.nextInt();
			arrnum[count] = number; //입력된 숫자 배열에 저장
			
			if(random==number) { //숫자가 맞는지 비교
				System.out.println("정답입니다.");
				break;
			}
			
			
			count++; //도전횟수 1증가
			if(count>9) { //도전횟수가 10번인지 확인
				System.out.println("10번을 모두 하셨습니다. 프로그램을 종료합니다.");
				count--;
				break;
			} 
			
		}//while
		System.out.println("도전 횟수 :" + (count+1));
		//배열출력 방법
		System.out.print("입력한 숫자 :" );
		for(int i=0;i<10;i++) {
			System.out.print(arrnum[i]+" ");
		}
		System.out.println();
		System.out.println("랜덤숫자:" + random);

	}//main
}//class
