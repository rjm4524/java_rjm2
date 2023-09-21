package p0921;

public class JA0921_10 {

	public static void main(String[] args) {
		ColAction2 col = new ColAction2();
		Card[] ca = col.cardIn();
		for(int i=0; i<ca.length; i++) {
			System.out.printf("카드번호 : %d , 카드모양 :%s \n",ca[i].getNumber(),ca[i].getKind());
		}

	}

}
