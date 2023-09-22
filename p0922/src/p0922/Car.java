package p0922;

public class Car {
	
	public Car() {}
	
	public Car(String color, int door) {
		Color = color;
		this.door = door;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	private String Color;
	private int door;

}
