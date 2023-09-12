package p0912;

public class Deck {

	Card[] c = new Card[52];
	String[] Shape = { "Heart", "Spade", "Diamond", "Clover" };

	Deck() { // 기본 생성자
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card(Shape[i/13],(i%13)+1);
//			c[i] = new Card();
//			c[i].number = (i % 13) + 1;
//			c[i].kind = Shape[i / 13];
			
			
			// System.out.println(c[i]);
		}

	}// Deck
	//특정 카드 가져오기
	Card pick(int no) {
		if(no>52) {
			System.out.println("숫자를 잘못 선택하셨습니다.");
			return c[no%52];
		}
		return c[no];
	}
	//랜덤카드 가져오기
	Card pick() {
		int random = (int)(Math.random()*52);
		return c[random];
	}
	
	
	

	void shuffle() {
		// 52 -> 0~51
		for (int i = 0; i < 1000; i++) {
			int random = (int) (Math.random() * 52);
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}//for
	}//void

	// 모든카드 출력 메소드.
	void CardPrint() {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}//for
	}//void
}//class
