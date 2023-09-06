package p0905;

public class JA0905_05 {

	public static void main(String[] args) {
		//구구단 출력 
		for(int i=1;i<=9;i++) {
			System.out.printf("[%d단]      \t",i);
		}
		
		for(int i=1;i<=9;i++) {
			//System.out.printf("[%d단]\n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%d*%d = %d \t ",j,i,(i*j) );
				
			}System.out.printf("\n");
		}
		

	}//main

}//class
