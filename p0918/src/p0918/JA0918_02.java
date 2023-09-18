package p0918;

public class JA0918_02 {

	public static void main(String[] args) {
		Unit[] group = new Unit[5]; //조상클래스로 객체선언.
		group[0] = new Marine(); //다형성
		group[1] = new Tank();
		group[2] = new DropShip();
		group[3] = new Marine(); 
		group[4] = new Tank();
		
		for(int i=0; i<group.length; i++) {
			group[i].move(100,200);
		}
		
		
	}

}
