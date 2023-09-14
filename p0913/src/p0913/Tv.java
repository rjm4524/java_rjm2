package p0913;

public class Tv extends Product {
	
	int size;
	
	Tv() {
		this("삼성Tv70",1000000,10000,70);
		
	}
	
	
	Tv(String pName, int price, int bounsPoint,int size) {
		this.pName = pName;
		this.price = price;
		this.bounsPoint = bounsPoint;
		this.size = size;
	}
	

}
