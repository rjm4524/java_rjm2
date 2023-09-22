package p0922;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class StuMain {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		StuAction s = new StuAction();
		loop: while (true) {

			System.out.println("-------------------------");
			System.out.println("[학생성적처리 프로그램");
			System.out.println("-------------------------");
			System.out.println("1. 학생입력");
			System.out.println("2.학생성적 출력");

			System.out.println("3.학생성적수정");
			System.out.println("4.학생성적 삭제");

			System.out.println("5.이름순 정렬 출력");
			System.out.println("6.학생높은 순 출력");
			System.out.println("7.성적낮은 순 정렬");
			System.out.println("8.파일가져오기");
			System.out.println("9.파일 저장");

			System.out.println("10.등수처리");
			System.out.println("0.프로그램 종료");
			System.out.println("-------------------------");
			//String strCh = JOptionPane.showInputDialog("원하는 번호를 입력하세요.");
			//choice = Integer.parseInt(strCh);
			choice = scan.nextInt();
			System.out.println();

			switch (choice) {
			case 1:// 성적입력
				s.StuInput();
				break;
			case 2:// 성적 출력
				s.StuOutput();
				break;
			case 3:// 성적 수정
               
				break;
			case 5:// 이름순 정렬
				s.stuNameSort();
			case 6:// 성적 높은순 정렬
				s.stuTotalhighSort();
				break;
			case 7:// 성적낮은 정렬
				s.stuTotalLowSort();
				break;
			case 8:// 파일 가져오기
				s.stuFopen();
				break;

			case 9:// 파일 저장
				s.stuFsave();
				break;
			case 0:
				System.out.println("[프로그램종료]");
				System.out.println();
				break loop;

			}// switch
		} // while

	}// main

}// class
