package p0906;

import java.util.Arrays;

public class JA0906_07 {

	public static void main(String[] args) {
		int[] score = new int[3];
		int[] num = {1,2,3};
		num = score; //주소를 복사 -> 값을 복사한것은 x 
		
		System.out.println(Arrays.toString(score));
		
		System.out.println("score:"+score);
		System.out.println("num :"+num);
		
		

	}

}
