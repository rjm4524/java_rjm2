package p0911;

import java.util.Scanner;

public class JA0911_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		int a = 0;
//		int b =0;
//		int c = 0;
//		int d = 0;
//		int e = 0;

		int[] n = new int[7];
		int result = 0;
		for (int i = 0; i < n.length; i++) {
			System.out.println(i + 1 + "번째 숫자를 입력하세요.");
			n[i] = scan.nextInt();
		}
		System.out.print("더하기 결과값 :");
		result = add(n); //int []n 배열의 주소값을 매개변수로 보냄.
		System.out.println(result);

		result = sub(n);
		System.out.print("뺴기 결과값 :");
		System.out.println(result);

		result = mult(n);
		System.out.print("곱하기 결과값 :");
		System.out.println(result);

		result = div(n);
		System.out.print("나누기 결과값 :");
		System.out.println(result);

	}

	static int add(int[] n) {
		int result = n[0];
		for (int i = 1; i < n.length; i++)
			result = result + n[i];

		return result;

	}

	static int sub(int[] n) {
		int result = n[0];
		for (int i = 1; i < n.length; i++)
			result = result - n[i];
		return result;
	}

	static int mult(int[] n) {
		int result = n[0];
		for (int i = 1; i < n.length; i++)
			result = result * n[i];
		return result;
	}

	static int div(int[] n) {
		int result = n[0];
		for (int i = 1; i < n.length; i++)
			result = result / n[i];
		return result;
	}

}
