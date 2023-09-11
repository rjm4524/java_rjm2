package p0908;

import java.util.spi.CalendarDataProvider;

public class JA0908_12 {

	public static void main(String[] args) {
		System.out.println(JA0908_11.avg(100,89, 172));
		System.out.println(JA0908_11.total(10,10,9));
		System.out.println(add(5,819));
		Card[] c = new Card[30];
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Card();
			c[i].number = i;
			c[i].kind = i;
			
		}

		
		
		
	}
	
	
	
	static int add(int a, int b) {
		int i = 0;
		i = a + b;
		return i;
	}

}
