package p0911;

public class JA0911_03 {

	public static void main(String[] args) {
		// Card 객체 4개를 선언해서, Heart,1 Spade,1 Diamond,1 Clover,1울 출력하시오.

		String[] shape = { "Heart", "Spade", "Diamond", "Clover" };
		Card[] c = new Card[52];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card();
			c[i].kind = shape[i/13];// 몫을 구하는식 (/) 0000 4번 1111 4번 2222 4번 ...
			c[i].number = (i%13)+1; //%는 나머지를 구하는 식 
			c[i].cardPrint();
		}
		
		System.out.println("카드 숫자 합 :");
		int result = JA0911_05.add(c[0].number,c[0].number);
		System.out.println(result);

	}

}
