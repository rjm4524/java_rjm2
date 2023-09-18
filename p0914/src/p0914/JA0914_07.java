package p0914;

import java.util.ArrayList;
import java.util.Scanner;

public class JA0914_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id = "";
		String pw = "";
		
		ArrayList list = new ArrayList();
		
		Member m = new Member("aaa","1111","홍길동","서울","010-1111-1111");
		list.add(m); //Member 객체는 Object객체로 자동 형변환됨.
		Member m1 = new Member("bbb","2222","박길동","서울","010-1111-1111");
		list.add(m1);
		Member m2 = new Member("ccc","3333","홍길동","서울","010-1111-1111");
		list.add(m2);
		Member m3 = new Member("dddd","4444","홍길동","서울","010-1111-1111");
		list.add(m3);
		Member m4 = new Member("eee","5555","홍길동","서울","010-1111-1111");
		list.add(m4);
		
		System.out.println("아이디를 입력하세요.");
	    id = scan.next();
	    System.out.println("패스워드를 입력하세요.");
	    pw = scan.next();
		
	    Member tempM = (Member)list.get(0);
	    String tempId = tempId.getId();
	    String tempPw = tempM.getPw();
	    if(id.equals(tempId)) {
	    	if(pw.equals(tempPw)) {
	    		System.out.println("로그인이 되었습니다.");
	    	}
	    }
		

	}

}
