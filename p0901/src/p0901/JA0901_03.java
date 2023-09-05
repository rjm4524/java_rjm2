package p0901;

public class JA0901_03 {

	public static void main(String[] args) {
//		int a = 1000000;
//		int b = 1000000;
//		long c = (long)a * b;
//		System.out.printf("%,d",c);
		
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 97;
		System.out.println(c2);
		char c3 = 65;
		System.out.println(c3);
		
		char c4 = (char)(c3+1); //
		System.out.println(c4);
		
		char c5 = ++c2;
		System.out.println(c5);
		
		char c6 = 48; //'0' -> 48
		System.out.println(c6);
		System.out.println((char)(c6+1)); // int 숫자에 0을 뺴면 char인 그숫자가 뜬다. 
		                                  // ex) (int)'1'-'0' = 1(char)
		int i = '4' - '0';
		System.out.println(i);
		
		int i2 = '7' - '0';
		System.out.println(i2);
	}

}
