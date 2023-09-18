package p0914;

import java.util.ArrayList;

public class JA0914_09 {

	public static void main(String[] args) {
		//배열 5개 - "aaa","1111" ,"
		Mam[] m = new Mam[5];
		m[0] = new Mam("aaa","1111");
		m[1] = new Mam("bbb","2222");
		m[2] = new Mam("ccc","3333");
		m[3] = new Mam("ddd","4444");
		m[4] = new Mam("eee","5555");
		
		for(int i=0; i<m.length; i++) {
			System.out.printf("[%s,%s] \n",m[i].id,m[i].pw);
		}
		
		System.out.println("------------");
		
      ArrayList list = new ArrayList();
      list.add(new Mam("aaa","1111"));
      list.add(new Mam("bbb","2222"));
      list.add(new Mam("ccc","3333"));
      list.add(new Mam("ddd","4444"));
      list.add(new Mam("eee","5555"));
      
      for(int i=0; i<list.size(); i++) {
    	  Mam Ma = (Mam)list.get(i);
    	  System.out.printf("[%s,%s]\n",Ma.id,Mna.pw);
      }
      
	
		

	}

}
