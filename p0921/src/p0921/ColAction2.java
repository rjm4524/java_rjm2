package p0921;

public class ColAction2 {
	Card[] Ca = new Card[52];
	String[] shape  = {"Spade","Heart","Diamond","Clover"};
	
	Card c = new Card();
	void cardAll() {
		//52장의 카드를 생성해서.
		for(int i=0;i<Ca.length;i++) {
			int number = (i%13)+1;
		    String kind = shape[i/13];
		    Ca[i] = new Card (number,kind);
		}
		
		
		
	}

	Card[] cardIn() {
		cardAll();
		return Ca;
	}
}
