package p0914;

import java.util.ArrayList;

public class JA0914_10 {

	public static void main(String[] args) {
		
		//배열 5개 입력, 출력
		//arrayList 5개입력,출력
		String id = "";
		String pw = "";
 		Member[] m = new Member[5];
		m[0] = new Member("aaa","1111","류진민","서울","010-3029-1021");
		m[1] = new Member("bbb","2222","류진a","서울","010-3029-1021");
		m[2] = new Member("ccc","3333","류진b","서울","010-3029-1021");
		m[3] = new Member("ddd","4444","류진c","서울","010-3029-1021");
		m[4] = new Member("eee","5555","류진d","서울","010-3029-1021");
		
		for(int i=0; i<m.length; i++) {
			System.out.printf("%s %s %s %s %s\n",m[i].getId(),m[i].getPw(),m[i].getName(),m[i].getAddress(),m[i].getPhone());
		}
		
		System.out.println("-----------------");
		
		
		
		ArrayList list = new ArrayList();
		list.add(new Member("aaa","1111","류진민","서울","010-3029-1021"));
		list.add(new Member("bbb","2222","류진민","서울","010-3029-1021"));
		list.add(new Member("ccc","3333","류진민","서울","010-3029-1021"));
		list.add(new Member("ddd","4444","류진민","서울","010-3029-1021"));
		list.add(new Member("eee","5555","류진민","서울","010-3029-1021"));
		
		for(int i=0; i<list.size(); i++) {
			Member Ma = (Member)list.get(i);
			System.out.printf("%s %s %s %s %s\n",Ma.getId(),Ma.getPw(),Ma.getName(),Ma.getAddress(),Ma.getPhone());
		}
		
		
		
	}
	
	
	
	
	
	

}
