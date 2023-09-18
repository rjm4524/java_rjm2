package p0914;

public class JA0914_03 {

	public static void main(String[] args) {
		
		Car c;//주소값만 존재.
		FireEngine f1 = new FireEngine();
		System.out.println("[f1의 기능을 실행합니다.]");
		f1.go();
		f1.water();
		f1.stop();
		c = f1;
		System.out.println("c의 기능");
		Amblance a1 = new Amblance();
		c= a1;
		
		c.go();
		c.stop();
		//c.water();//c에는 water공간은 있지만 참조변수 c는 water을 사용할수 없음
		System.out.println("[f2의 기능]");
		Amblance a2;
		FireEngine f2; // 주소값
		if( c instanceof FireEngine) {
			f2 = (FireEngine)c;
			f2.water();
			f2.go();
			f2.stop();
		}
		
		if(c instanceof Amblance) {
			a2 = (Amblance)c;
			a2.siren();
			a2.go();
			a2.stop();
		}

		//Amblance a2;
		a2 = (Amblance)c;
		f2 = (FireEngine)c; //형변환 생략 불가 . 
		
		
		

	}

}
