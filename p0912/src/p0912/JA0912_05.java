package p0912;

public class JA0912_05 {

	public static void main(String[] args) {
		Product p1 = new Product("led50", 50);
		Product p2 = new Product("led60", 55);
		Product p3 = new Product("led70", 60);
		Product p4 = new Product("led80");
		Product p5 = new Product("led100", 200);
		System.out.println("p1번호: " + p1.seriaNo);
		System.out.println("p1제품이름:" + p1.pName);
		System.out.println("p1가격:" + p1.price);
		System.out.println("p2번호: " + p2.seriaNo);
		System.out.println("p2제품이름:" + p2.pName);
		System.out.println("p2가격:" + p2.price);
		System.out.println("p3번호: " + p3.seriaNo);
		System.out.println("p3제품이름:" + p3.pName);
		System.out.println("p3가격:" + p3.price);
		System.out.println("p4번호: " + p4.seriaNo);
		System.out.println("p4제품이름:" + p4.pName);
		System.out.println("p4가격:" + p4.price);
		System.out.println("p5번호: " + p5.seriaNo);
		System.out.println("p5제품이름:" + p5.pName);
		System.out.println("p5가격:" + p5.price);
		
		Product[] p = new Product[5];
		for(int i=0; i<p.length; i++) {
			//Product p[i] = new Product(, 50);
		}

	}// main

}// class
