package p0921;

public class Card {
	
	
	private int number;
	private	 String kind;
	public Card() {}
	public Card(int number, String kind) {
		this.number = number;
		this.kind = kind;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String toString() {
		return String.format("%d,%s",number,kind);
	}

}
