package p0918;

abstract public class Player {
	int currentPos; //현재 위치저장변수
	
	Player() {
		currentPos = 0;
	
	}
	
	abstract void play(int pos);
	abstract void stop();
	
	void play() {
		play(currentPos); //추상매소드 play를 호출 (메소드 호출은 이름구현만 되어있으면 가능.)
	
	}
	
	
	

}
