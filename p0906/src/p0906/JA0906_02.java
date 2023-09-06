package p0906;

public class JA0906_02 {

	public static void main(String[] args) {
		//배열 100개를 생성하고 , 1-100까지 숫자를 입력해서 출력하시오.
		
		int[] arrnum = new int[100]; 
		
		for(int i=0;i<arrnum.length;i++) {
			arrnum[i] = i+1;
		}
		System.out.println("입력된 숫자");
		for (int i=0;i<arrnum.length;i++) {
			if(i==0) {
				System.out.print(arrnum[i]);
			}else {
				System.err.print("," + arrnum[i]);
			}
		}
		System.out.println();

	}

}
