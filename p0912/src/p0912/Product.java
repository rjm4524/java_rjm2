package p0912;

public class Product {
	static int count = 0;// 클래스변수
	int seriaNo; // 인스턴스 변수
	String pName;
	int price;

	{
		count++;
		seriaNo = count;
	}

	Product() { // 기본생성자
		

	}

	Product(String pName, int price) {

		// this.seriaNo = seriaNo;
		this.pName = pName;
		this.price = price;
	}

	Product(String pName) {
		this.pName = pName;

	}

}
