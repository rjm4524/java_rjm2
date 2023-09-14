package p0913;

public class JA0913_07 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		System.out.println("현재 잔액 :" + b.money);
		Tv t = new Tv();
		System.out.println(t.price);
		b.buy(t);
		System.out.println("현재가격 :" + b.money);
		System.out.println("현재 포인트 :" + b.bounsPoint);
		
		
		b.buy( new Computer());
		System.out.println("현재 잔액 :" + b.money);
		System.out.println("현재 포인트 :" + b.bounsPoint);
		
		b.buy(new Audio());
		System.out.println("현재 잔액 :" + b.money);
		System.out.println("현재 포인트 :" + b.bounsPoint);

	}

}
