package p0919;

public class JA0919_01 {

	public static void main(String[] args) {
		int[] n = {10,20,30,40,50};
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
		
		
		System.out.println("-----------------");
		for(int a:n) {//단순 for문
			System.out.println(a);
		}
		System.out.println("----------------------");
		

	}

}
