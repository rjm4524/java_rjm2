package p0911;

public class Car {

	public static void main(String[] args) {
		
		Car2 c = new Car2();
		c.color = "White";
		c.gearType = "auto";
		c.door = 5;
		
		Car2 c1 = new Car2();
		c1.color = "Black";
		c1.gearType = "auto";
		c1.door = 6;
		
		Car2 c2 = new Car2();
		c.color = "Red";
		c.gearType = "auto";
		c.door = 7;
		
		Car2 c3 = new Car2("Silver","auto", 5);
		Car2 c4 = new Car2("Green","auto",4);
				

	}//main

}//class

