package p0901;

import java.util.Scanner;

public class jA0901_04 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("숫자3개를 입력하세요."); //27 -> 2,7 분리를 해야함.
        String number = scan.next();
        
        //String 분리
        char ch1 = number.charAt(0); // 27 2의 주석값은 0 . 7의 주석값은 1
        char ch2 = number.charAt(1);
        char ch3 = number.charAt(2);
        //char타입을 int타입으로 변경
        int n1 = ch1 - '0'; 
        int n2 = ch2 - '0';
        int n3 = ch3 - '0';
        int result = n1 + n2 + n3;
        
        //char ch3 = '2'; // '0' -> 아스키 코드 48
        
        
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println("세가지 수의 결과값 : " + result);
	}

}
