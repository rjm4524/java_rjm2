package p0912;

public class JA0911_04 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color = "white";
		System.out.println("c1.color:" + c1.color);
//		주소값이 복사되어 c1과c2가 같아짐.
//		Car c2 = c1;
//		c2.color = "blue";
//		System.out.println(c2.color);
		
		Car c2 = new Car(c1); //객체선언이 되면 주소는 다르다.
		System.out.println("c2.color:"+c2.color);
		c2.color = "pink";
		System.out.println(c2.color);

	}

}
