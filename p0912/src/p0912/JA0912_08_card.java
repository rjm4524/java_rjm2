package p0912;

public class JA0912_08_card {

	public static void main(String[] args) {
		//카드 12장 - spade를 1-13까지 
		Deck d = new Deck();
		d.CardPrint();
		System.out.println("-----------------------");
		d.shuffle();
		d.CardPrint();
		System.out.println("카드한장 출력");
		System.out.println(d.pick(0));
		//d.pick(3);

	}

}
