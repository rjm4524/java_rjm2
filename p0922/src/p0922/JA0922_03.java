package p0922;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JA0922_03 {
//변수넘기기 
	public static void main(String[] args) {
       
		//변수
		int n1 = 1000;
		int n2 = 125;
		int a = 1;
		
		//객체
//		String color = "white";
//		int door = 5;
		
		
		//매개변수는 6개 - > 리턴 map으로 받기.
		
		
		String[] color = {"white","red","bule"};
		int[] door = {5,4,5};

		String[] name = {"홍길동","류진민","고길동"};
		int[] kor = {100,99,90};
		int[] eng = {100,98,89};
		int[] math = {100,91,82};
		
		
		JAction j = new JAction();
		
		HashMap<String, Object> map = j.cal(color, door, name, kor, eng, math);
		
		ArrayList<Car> list = (ArrayList<Car>)map.get("list"); 
		ArrayList<StuScore> list2 = (ArrayList<StuScore>)map.get("list2"); 
		
		for(int i=0; i<list.size(); i++) {
			Car c = list.get(i);
			System.out.printf(c.getColor(),c.getDoor());
		}
		
		for(int i=0; i<list2.size(); i++) {
					StuScore s = list2.get(i);
					System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d",
					s.getStuNum(),s.getName(),
					s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),
					s.getAvg(),s.getRank());
		}
			
		
				
		
		
		
		//매개변수 2개 보낸후 list타입으로 받음.
//		ArrayList<Car> list = j.cal(color,door);
//		for(int i=0; i<list.size(); i++) {
//		System.out.printf("%s,%d \n",list.get(i).getColor(),list.get(i).getDoor());
//		}
		
		
		
		
		
		
		
		
		
		
		//객체로보내기. 
//		Car c = j.cal(color,door);
//		System.out.printf("%s,%d",c.getColor(),c.getDoor());
		//리턴타입 객체 
		
		
		
		
		
		
		//매개변수 2개를 보냄 -> 리턴 배열타입으로 받기
//		int[] result = j.cal(n1, n2);
//		for(int i=0; i<result.length; i++) {
//			System.out.println(result[i]);
//			
//		}
		
		// n1,n2를 JAction cal 메소드로 보내서
		// 곱한 결과값을 리턴해서 출력.
		
		
		
		//매개변수 2개 -> 리턴 int 타입으로 받음.
//		int result = j.cal(n1, n2, a); // 매개변수로 값을 넘겨줄수있음.
//		System.out.println("결과값은 : " + result);

	}// main

}// class
