
package p0921;

import java.util.ArrayList;
import java.util.Vector;

public class JA0921_05 {

	public static void main(String[] args) {
		ArrayList <Card> list = new ArrayList();
		list.add(new Card(1,"Spade"));
		list.add(new Card(2,"Spade"));
		list.add(new Card(3,"Spade"));
		list.add(new Card(4,"Spade"));
		list.add(new Card(1,"Spade"));
		
		//list.add(new StuScore()); //입력불가
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getKind());
			System.out.println(list.get(i).getNumber());
		}
		
		
		
		
//		for(int i=0; i<list.size(); i++) {
//			Card c = (Card)list.get(i);
//			System.out.println(list.get(i));
//		} 중요
		
//		ArrayList list = new ArrayList(); //싱글 쓰레드 지원
//		//Vector list2 = new Vector(); //멀티쓰레드 지원 
//       list.add(1);
//       list.add(2);
//       list.add(3);
//       list.add(1);
//       list.add(5);
//       
//       for(int i=0; i<list.size(); i++) {
//    	   System.out.println(list.get(i));
//       }
	}

}
