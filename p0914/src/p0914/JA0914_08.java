package p0914;

import java.util.ArrayList;

public class JA0914_08 {

	public static void main(String[] args) {
		//1.배열크기 제한, 2.같은타입만 가능 3.삭제불가 4.사이에 추가 불가
		Card[] c = new Card[4];
		c[0] = new Card("Spade",1);
		c[1] = new Card("Heart",2);
		c[2] = new Card("Diamond",3);
		c[3] = new Card("Clover",4);
		
		for(int i=0; i<c.length; i++) {
		System.out.printf("[%s,%d]\n",c[i].kind,c[i].number);
		}
		System.out.println("------------------");
		//배열의 크기제한이 없음, 2.타입이 자유롭다. 3.삭제가 가능, 4.추가가 자유롭다.
		ArrayList list = new ArrayList();
		list.add(new Card("Spade",1));//Object로 형변환됨.
		list.add(new Card("Heart",2));
		list.add(new Card("Diamond",3));
		list.add(new Card("Clover",5));
		list.add(new Card("Clover",6));
		list.add(new Card("Clover",7));
		list.add(new Card("Clover",8));
		list.add(new Card("Clover",9));
		list.add(new Card("Clover",10));
		list.add(new Card("Clover",11));
		list.add(new Card("Clover",12));
		list.add(new Card("Clover",13));
		list.add(new Card("Clover",14));
		list.add(new Card("Clover",15));
		
		for(int i=0; i<list.size(); i++) {
			Card ca = (Card)list.get(i);
			System.out.printf("[%s,%d]\n",ca.kind,ca.number);
		}
		
		
		
		
		
		
		
		
		
//		Card c = new Card("Spade",1);
//		Card c2 = new Card("Heart",2);
//		Card c3 = new Card("Diamond",3);
//		Card c4 = new Card("Clover",4);

		
		

	}

}
