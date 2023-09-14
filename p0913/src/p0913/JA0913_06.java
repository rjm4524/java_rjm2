package p0913;

public class JA0913_06 {

	public static void main(String[] args) {
		FireEngine f1 = new FireEngine();
		f1.water();//FireEngine 메소드
		f1.go();//Car메소드
		f1.stop();//""
		Ambulance a1 = new Ambulance();
		a1.siren();//Ambulance 메소드
		a1.go();//Car 메소드
		a1.stop();//""
		//다형성
		Car c1 = new FireEngine(); //다형성
		c1.go();
		c1.stop();
		//c1.water();//공간은 있지만 사용은안됨. (자손 클래스에만 존재.)
		
		//다형성
		Car c2 = new Ambulance();
		c2.go();
		c2.stop();
		//c2.siren(); 자손의 메소드
        
		Car c3;
		c3 = f1; //조상 참조변수 = 자손 참조변수
		//c3.water(); 공간이 있어도 조상의 참조변수로는 사용 할 수 없음.
		FireEngine f2;
		f2 = (FireEngine)c3;
		f2.water();
		
	    Ambulance a2;
	    FireEngine f3;
	    if(c3 instanceof FireEngine) {
	       System.out.println("c3는 FireEngine으로만 형변환가능합니다.");
	       f3 = (FireEngine)c3;
	       f3.water();
	    }
	    
	    if(c3 instanceof Ambulance) {
	    	System.out.println("c3는 Ambulance로 형변환가능합니다.");
	    }
	    
	    Object o1; //오브젝트는 최고 조상이기에 모든 클래스로 형변환 가능
	    o1 = f1;
	    o1 = a1;
	    
	    //에러 a2=(Ambulance)c3; //c3에는 FireEngine 객체가 담겨있음
		//a2.siren(); 타입이 다르기에 . (c3는 fire , a2는 Ambule)컴파일시 에러 발생 
		
		
		
	}//maim

}//class
