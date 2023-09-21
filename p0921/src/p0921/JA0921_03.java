package p0921;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JA0921_03 {

	public static void main(String[] args) throws Exception {
		//StuScore 객체 이름,국어,영어,수학 ArrayList 입력한 데이터를 저장하시오.
		StuScore s1 = new StuScore();
		Scanner scan = new Scanner(System.in);
		ArrayList<StuScore> list = new ArrayList();
		System.out.println("이름을 입력하세요.");
		String name = scan.next();
		System.out.println("국어점수를 입력하세요.");
		int Kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int Eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int Math = scan.nextInt();
		
		list.add(new StuScore(name,Kor,Eng,Math));
		
		String date = String.format("%s,%d,%d,%d\r\r"
				,name,Kor,Eng,Math);
		
		FileWriter fw = new FileWriter("c:/aaa/stu2.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("파일이 저장되었습니다.");
		
		

	}

}
