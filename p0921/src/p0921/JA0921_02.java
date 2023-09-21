package p0921;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JA0921_02 {

	public static void main(String[] args) throws Exception {
		//학번,이름,국어,영어,수학 점수를 입력받아, 파일에 저장하시오.
		while(true) {
			
			Scanner scan = new Scanner(System.in);
			ArrayList<StuScore> list = new ArrayList();
			System.out.println("학번을 입력하세요.(프로그램종료.0)");
			int stuNum = scan.nextInt();
			if(stuNum==0) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("이름을 입력하세요.");
			String Name = scan.next();
			System.out.println("국어점수를 입력하세요."); 
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			int math = scan.nextInt();
			
			int total = kor+eng+math;
			double avg = total/3.0;
			int rank = 0;
			
			//객체생성해서 list에 담기 (컬렉션 프레임웍)
			StuScore s1 = new StuScore(stuNum,Name,kor,eng,math); //갯수추가시 수작업 1단계
			StuScore[] s = new StuScore[10]; //갯수에 제한 (10) 2단계
			list.add(new StuScore(stuNum,Name,kor,eng,math)); //갯수제한 없는 무한 3단계
			
			
			//입력한 데이터를 문자열로 변경
			String date = String.format("%d,%s,%d,%d,%d,%d,%.2f%d\r\r",
					stuNum,Name,kor,eng,math,total,avg,rank);
			
			//파일에 저장
			FileWriter fw = new FileWriter("c:/aaa/stu1.txt",true); //true -이어쓰기 false - 덮어쓰기
			//한줄단위로 저장
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(date);
			bw.close();
			
			System.out.println("입력한 데이터를 파일에 저장했습니다.");
		}
		
		
		
		
		

	}//main

}//class
