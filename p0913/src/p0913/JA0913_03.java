package p0913;

import p0913_02.CCard;

public class JA0913_03 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "Spade";
		c1.number = 2;
		//c1.flag =1;
		System.out.printf("%s.%d\n",c1.kind,c1.number);
		System.out.printf("%s.%d,%d",c1.kind,c1.number);
		CCard c2 = new CCard(); //public 모든 패키지에서 사용가능

	}

}
