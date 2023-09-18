package p0918;

import java.util.Scanner;

public class p0915_학생성적 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction(); // 객체선언
		int stuCount = 1;
		String[] title = { "번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

		// 무한반복
		loop:while (true) {
			// 메인화면 출력부분
			int choice = stuAction.mainPrint();
			switch (choice) {
			case 1:
				// 1. 학생입력 메소드
				stuCount = stuAction.stuInput(stuCount);
				break;
			case 2:
				// 2.학생성적 출력 메소드
				stuAction.stuOutput();
				break;
			case 3:
				// 3.학생성적 수정 메소드
				stuAction.stuUpdate();
				break;
			case 4:
				// 4.학생성적 삭제 메소드
				stuAction.stuDelete();
				break;

			case 5:
				// 5.학생성적 검색 메소드
				stuAction.stuSearch();
				break; // switch
				
			case 6:
				//6.등수처리 메소드
				System.out.println();
				System.out.println("[ 학생성적 등수처리 ]");
				System.out.printf("등수처리를 진행할까요?(0.이전페이지 이동)\n");
				System.out.println("1.예");
				System.out.println("2.아니요");
				System.out.println("0.이전페이지 이동");
				choice = scan.nextInt();
				switch(choice) {
				case 1:
					for(int i=0; i<stuAction.list.size(); i++) {
						int count = 1;
						StuScore s = (StuScore)StuAction.list.get(i);
						for(int j=0; j<stuAction.list.size(); j++) {
							StuScore s2 = (StuScore)StuAction.list.get(j);
							if(s.getTotal()<s2.getTotal()) {
								count ++;
								
							}//if
							
						}//for j
						s.setRank(count); //등수 입력
					}//for i
					
					System.out.println("등수처리가 완료되었습니다!");
					break;
				
				
				case 2:
					System.out.println("등수처리가 취소 되었습니다.");
					System.out.println();
					break;//case 6-2
					
				case 0: 
					System.out.println("이전페이지로 이동합니다.");
					System.out.println();
					break;//case 6-0
				}//switch
				break;//case 6
			case 0:
				System.out.println();
				System.out.println("[프로그램 종료 ]");
				System.out.printf("프로그램을 종료합니다!\n");
				break loop;

			}// switch -각메뉴

		} // while main 출력

	}// main

}// class
