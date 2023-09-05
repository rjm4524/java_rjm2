package p0904;

import java.util.Scanner;

public class JA0904_04 {

	public static void main(String[] args) {
		//90점 이상 A, 80점 B ,70점 이상 C, 60점이상 D, F
		//점수를 입력받아. 성적을 출력하시오.
		//98점 이상 A+, 93점 이하 A- , ...
		String grade = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int num = scan.nextInt();
		if(num>=90) {
			grade = "A";
			//System.out.print("A");
			if(num>=98) {
				//System.out.println("+");
			grade = grade + "+";
			}else if(num<=93) {
				//System.out.println("-");
			grade = grade + "-";
			}
			
		}else if(num>=80) {
		grade = "B";
		if(num>=88) {
			grade = grade + "+";
		}else if(num<=83) {
			grade = grade + "-";
		}
		}else if(num>=70) {
			grade = "C";
			if(num>=78) {
				grade += "+";
			}else if (num<=73) {
				grade += "-";
			}
		}else if(num>=60) {
			grade = "D";
			//System.out.print("D");
			if(num>=68) {
				grade = grade + "+";				
				//System.out.println("+");
			}else if(num<=63) {
				grade = grade + "-";
				//System.out.println("-");
			}
		}else {
			grade = "F";
		}
		
		System.out.println("학점 : " + grade);
		System.out.println("점수 :" + num);
			
	}

}
