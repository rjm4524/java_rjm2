package p0913;

public class Deck {
	Card[] c = new Card[52];
	String[] shape = {"Heart","Spade","Diamond","Clover"};
	Deck () {
		for(int i=0; i<c.length; i++) {
			c[i] = new Card(shape[i/13],(i%13)+1);
			
			c[i].kind = shape[i/13];
			c[i].number = (i%13)+1;
			
		}
		}
	

	void cardPrint() {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);

		}
	}

	void shuffle() {
		for (int i = 0; i < 500; i++) {
			int random = (int) (Math.random() * 52);
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;

		}
	}

	Card pink(int no) {
		if (no > 52) {
			System.out.println("숫자를 잘못 입력하셨습니다.");
			return c[no % 52];
		}
		return c[no];
	}

	Card pink() {
		int random = (int) (Math.random() * 52);
		return c[random];
	}

}
