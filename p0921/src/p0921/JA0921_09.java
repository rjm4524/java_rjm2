package p0921;

import java.util.ArrayList;
import java.util.HashMap;

public class JA0921_09 {

	public static void main(String[] args) {
		CalAction cal = new CalAction();
		//list 1,list 2 전부 출력
		HashMap<String,Object> map = cal.scoreAll();
		
		ArrayList<StuScore> list = (ArrayList<StuScore>) map.get("list");
		
		for(int i=0; i<list.size(); i++) {
			StuScore s = list.get(i);
			System.out.printf("%d,%s,%d,%d,%d,%d,%.2f\n",s.getStuNum(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
			
			
		}
		
		
		ArrayList<Car> list2 = (ArrayList<Car>) map.get("list2");
		for(int i=0; i<list2.size(); i++) {
			Car c = list2.get(i);
			System.out.printf("%s, %d\n",c.getColor(),c.getDoor());
		}
		
//		ArrayList<Car> list2 = cal.scoreAll();
//		
//		for(int i=0; i<list2.size(); i++) {
//			Car c = list2.get(i);
//			System.out.printf("%s, %d\n",c.getColor(),c.getDoor());
//		}
	   
		
		
		
//		ArrayList <StuScore> list = cal.scoreAll();
//		//list를 전달받아, 출력하시오.
//		for(int i=0; i<list.size(); i++) {
//			StuScore s = list.get(i);
//	    System.out.printf("%s,%d,%d,%d,%d,%.2f\n"
//	    		,s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
//	    
//		}
		
		
//		Card[]card = cal.cardInsert();
//		
//		for(int i=0; i<card.length; i++) {
//			System.out.printf("카드모양 :%s, 카드번호 :%d\n",card[i].getKind(),card[i].getNumber());
//			
//			
//		}
		
		

	}

}
