package p0914;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Buyer {
	Buyer() {
	}

	Buyer(String id, String name) {
		this.id = id;
		this.name = name;

	}

	String id;
	String name;
	int money = 10000000;
	int bonusPoint = 0;
	// Product[] cart = new Product[10];
	// 컬렉션 프레임워크
	//컬렉션 선언 
	ArrayList list = new ArrayList(); 

	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p); // p를 Product []배열에 담음.★
		
	}

//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//
//	}
//
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
//	
//	void buy(Washing w) {
//		money -= w.price;
//		bonusPoint += w.bonusPoint;
//	}

}