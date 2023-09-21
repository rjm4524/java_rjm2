package p0921;

import java.util.ArrayList;
import java.util.HashMap;

public class CalAction {
	
	
	ArrayList<StuScore> list = new ArrayList();
	ArrayList<Car> list2 = new ArrayList();
    HashMap<String, Object> map = new HashMap();
	Card[] card = new Card[52];
	String[] shape = {"Spade","Heart","Diamond","Clover"};
	
	
	HashMap<String,Object> scoreAll() {
		list.add(new StuScore("류진민",100,100,99));
		list.add(new StuScore("박진민",95,30,89));
		list.add(new StuScore("김진민",10,40,9));
		
		
		list2.add(new Car("white",5));
		list2.add(new Car("red",4));
		list2.add(new Car("black",5));
		
		map.put("list", list);
		map.put("list2", list2);
		
		
		return map;
		
	}
	
	
	//학생3명 리턴
//	ArrayList<Car> scoreAll() {
//		list.add(new StuScore("류진민",100,100,99));
//		list.add(new StuScore("박진민",95,30,89));
//		list.add(new StuScore("김진민",10,40,9));
//		
//		
//		list2.add(new Car("white",5));
//		list2.add(new Car("red",4));
//		list2.add(new Car("black",5));
//		
//		
//		
//		return list2;
//		
//	}
	
    
	//3대
	
	
	
	void cardAll() {
		//1-13
		//spade,heart,diamond,Clover
		//52장 생성
		for(int i=0;i<card.length;i++) {
			int number = i%13+1; // 1~13까지 
			String kind = shape[i/13];
			card[i] = new Card(number,kind);
			
			
		}
		
	}//cardAll
	
	Card[] cardInsert() {
		cardAll(); //52장 생성
		return card;
		
	}
	
	
	//카드1장 리턴
//	Card[] cardInsert() {
//		cardAll(); //52장 생성
//		
//		Card c = new Card();
//		c.setNumber(1);
//		c.setKind("Spade");
//		return card;
//		
//	}

}
