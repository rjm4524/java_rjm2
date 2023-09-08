package p0908;

public class JA0908_08 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "heart"; //클래스 변수
		c1.number = 1;//인스턴스 변수
		Card.width = 100;
		Card.height = 250;
		
		
		Card c2 = new Card();
		c2.kind = "Diamond"; //클래스 변수
		c2.number = 2; //인스턴스 변수
		
		Card c3 = new Card();
		c3.kind = "Clover";
		c3.number = 3;
		
		Card c4 = new Card();
		c4.kind = "spade";
		c4.number = 4;
		
		System.out.println("c1 :" + c1.kind+","+c1.number);
		System.out.println("c2 :" + c2.kind +","+c2.number);
		System.out.println("c3 :" + c3.kind +","+c3.number);
		System.out.println("c4 :" + c4.kind +","+c4.number);

	}

}
