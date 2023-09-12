package p0912;

public class Shape {
	Point[] p;
	
	Triangle() {}
	
	String typeName;
	String color = "blue";
	void draw() {
		System.out.println(this.typeName+"도형 그림을 출력합니다.");
	}
	

}
