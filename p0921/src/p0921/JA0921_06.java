package p0921;

import java.util.ArrayList;

public class JA0921_06 {
public static void main(String[] args) {
	//ArrayList 
	//White,5 red,4 black,5 gry,5 blue,4
	//Car 객체 5개를 list에 추가하여 출력하시오
	
	ArrayList<Car> list = new ArrayList();
	list.add(new Car("White",5));
	list.add(new Car("red",4));
	list.add(new Car("black",5));
	list.add(new Car("gry",5));
	list.add(new Car("bule",5));
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
		
	}
}

}
