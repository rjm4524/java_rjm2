package p0912;

public class JA0912_08_card {

	public static void main(String[] args) {
		//카드 12장 - spade를 1-13까지 
		Deck d = new Deck();
		d.CardPrint();
		System.out.println("-----------------------");
		d.shuffle();
		d.CardPrint();
		System.out.println("카드5장 출력");
		for(int i=0; i<5; i++) {
		System.out.println(d.pick(i));
		//d.pick(3);
		}
		
		Card[] a = new Card[5];
		Card[] b = new Card[5];
		System.out.println("a : 카드 5장");
		for(int i=0; i<5; i++) {
			a[i] = d.pick(i);
			System.out.println(a[i]);
		}
		System.out.println("b: 카드 5장");
		for(int i=0;i<5;i++) {
			b[i] = d.pick(i+5);
			System.out.println(b[i]);
		}

	}
	//a:5장 - a라는 배열을 만든후 5장을 저장해서 출력 
	//b:5장

}
