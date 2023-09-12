package p0912;

import java.util.Scanner;

public class JA0912_03 {

	public static void main(String[] args) {
		//3명의 성적을 입력받아 출력하시오. StuScore객체를 활용
		Scanner scan = new Scanner(System.in);
		Stu s[] = new Stu[3];
		int StuNo = 0;
		String name = "";
		int kor,eng,math = 0;
		int score[] = new int[3];
		String[] Subject = {"국어","영어","수학"};
		
		
		
		
		for(int i=0;i<s.length;i++) {
		StuNo = i + 1;
		System.out.println("이름을 입력하세요.");
		name = scan.next();
		for(int j=0; j<s.length; j++) {
		System.out.println(Subject[j]+"점수를 입력하세요.");
		score[j] = scan.nextInt();
		
		
		
		}
		Stu s[i] = new Stu(s[i].StuNo,s[i].name,s[i].score[0],score[1],score[2]) {
			
		}
		
		}
		for(int i = 0; i<s.length; i++) {
			
		}
		

	}

}
