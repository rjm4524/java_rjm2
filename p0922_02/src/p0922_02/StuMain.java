package p0922_02;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {
	public static void main(String[] args) {
		StuAction sa = new StuAction();

		Scanner scan = new Scanner(System.in);
		int choice = 0;
		loop:while (true) {
			System.out.println("[학생성적 프로그램]");
			System.out.println("------------------");
			System.out.println("1.학생 성적입력");
			System.out.println("2.학생 성적 출력");
			System.out.println("3.학생 성적 수정");
			System.out.println("0.프로그램 종료.");
			choice = scan.nextInt();

			// 1.학생성적및정보입력
			switch (choice) {
			case 1:
				System.out.println("학생 이름을 입력하세요.(0.이전 페이지로 이동)");
				String name = scan.next();
				if(name.equals(0)) {
					System.out.println("이전페이지로 돌아갑니다.");
					break;
				}
				System.out.println("국어점수를 입력하세요.");
				int kor = scan.nextInt();
				System.out.println("영어점수를 입력하세요.");
				int eng = scan.nextInt();
				System.out.println("수학점수를 입력하세요.");
				int math = scan.nextInt();
				System.out.println("학생 성적이 저장되었습니다.");
				break;

			// 2.학생성적 출력
			case 2:
				System.out.println("[학생성적 출력]");
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\t");
				for (int i = 0; i < sa.list.size(); i++) {
					StuScore s = sa.list.get(i);
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t", s.getStuNum(), s.getName(), s.getKor(),
							s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
					System.out.println();

					break;
				}
				//3.성적수정
			case 3:
				int count = 0;
				System.out.println("[학생성적 수정]");
				System.out.println("수정을 원하시는 학생을 입력해주세요.(0.이전페이지로 돌아갑니다.)");
				String upname = scan.next();
				if(upname.equals(0)) {
					System.out.println("이전페이지로 돌아갑니다.");
					break;
				}
				for(int i=0; i<sa.list.size(); i++) {
					if(upname.equals(sa.list.get(i).getName())) {
						System.out.println("입력된 학생이 검색되었습니다.");
						count = 1;
						
						break;
					}
				}
				if(count==0) {
					System.out.println("검색하신 학생을 찾을수 없습니다. 다시 입력해주세요.");
					continue;
				}
				
				System.out.println("수정하실 과목을 선택하세요.");
				System.out.println("1.국어");
				System.out.println("2.영어");
				System.out.println("3.수학");
				
				choice = scan.nextInt();
				
				switch(choice) {
				case 1: 
					System.out.println("수정하실 점수를 입력해주세요. (현재점수 :)"+sa.list.get(kor));
				
				}
				
				
				
				break;
				
				
				
				

			}// switch

		} // while

	}// main
}// class
