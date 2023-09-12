package p0912;

public class JA0912_07 {

	public static void main(String[] args) {
		Circle c1 = new Circle();//(0,0),100,원형
		//(150,150) , 50 , 원형
		Circle c2 = new Circle(new Point(150,150),50,"원형");
		
		//두가지를 하나로 합친것과 같음 ^^^
//		Point p = new Point(150,150);
//		Circle c2 = new Circle(p,50,"원형");
		
		Point[] p = {
				new Point(100,100),
				new Point(140,50),
				new Point(200,100)
		};//점이 3개를 가지고 있는 배열
		
		Triangle t1 = new Triangle(p,"삼각형");
		t1.draw();
		
		
		//Triangle t3 = new Triangle(p);
		
//		Triangle t2 = new Triangle(
//				new Point(10,10),
//				new Point (20,20),
//				new Point (100,100)
//				"삼각형");

	}

}
