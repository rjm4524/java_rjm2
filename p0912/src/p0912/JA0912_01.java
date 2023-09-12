package p0912;

public class JA0912_01 {

	public static void main(String[] args) {
		Time t = new Time();
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(10);
		
		Car c1 = new Car();
		c1.color = "White";
	    c1.gearType = "auto";
	    c1.door = 5;
	    
	    Car c2 = new Car("White","auto",5);
	    System.out.println(c2.gearType);
	    System.out.println(c2.color);
	   
	
		
		

	}//main

}
