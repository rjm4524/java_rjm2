package p0912;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){
		this("White","auto",5); //다른생성자 호풀
		
	}
	
	Car(Car c){
		this(c.color,c.gearType,c.door); // 
	}
	
	//Car(){}
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	     
	     

}
