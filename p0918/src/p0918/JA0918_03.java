package p0918;

public class JA0918_03 {

	public static void main(String[] args) {
		Tank t = new Tank(); //탱크 1
		Scv s = new Scv(); //scv 1
		Marine m = new Marine(); //marine 1
		DropShip d = new DropShip();
		System.out.println("탱크 폭탄 맞음.");
		t.hitPoint -= 10;
		System.out.println("탱크 폭탄 맞음 ");
		t.hitPoint -= 10;
		System.out.println("탱크 총알 맞음");
	    t.hitPoint -= 2;
		System.out.println("탱크의 체력 : " + t.hitPoint);
		
		s.repair(t);
		System.out.println("탱크의 체력이 회복되었습니다.");
		System.out.println("탱크의 체력 : " + t.hitPoint);
		System.out.println("드랍이 총알 맞음.");
		d.hitPoint -= 20;
		System.out.println("드랍의 체력 :"+ d.hitPoint);
		s.repair(d);
		System.out.println("드랍의 체력이 회복되었습니다.");
	    System.out.println("마린 총알 맞음 ");
	    m.hitPoint -= 30;
	    System.out.println("마린의 체력 :" + m.hitPoint);
	   // s.repair(m);
	    System.out.println("마린의 체력이 회복이 되었습니다.");
	    System.out.println("마린의 체력 :" + m.hitPoint);

	}

}
