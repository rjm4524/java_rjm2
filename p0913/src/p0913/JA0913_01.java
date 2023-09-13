package p0913;

public class JA0913_01 {

	public static void main(String[] args) {
		Deck d = new Deck();
		d.cardPrint();
		System.out.println("----------------------------");
		d.shuffle();
		d.cardPrint();
		System.out.println("카드한장 출력");
		System.out.println(d.pink());
	}

}
