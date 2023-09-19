package p0919;

public class JA0919_02 {

	public static void main(String[] args) {
		KorPerson k1 = new KorPerson("040629-0000000","류진민");
		KorPerson k2 = new KorPerson("040629-0000000","박진민");
		KorPerson k3 = new KorPerson("040629-2000000","김진민");
		
	    if(k1.equals(k2)) {
	    	System.out.println("k1,k2는 같은 사람입니다.");
	    }else {
	    	System.out.println("k1,k2는 다른사람입니다.");
	    }
	    System.out.println(k1);
	    System.out.println(k2);
	    System.out.println("------------------------");
	    if(k1.equals(k3)) {
	    	System.out.println("k1,k3는 같은 사람입니다.");
	    }else {
	    	System.out.println("k1,k3는 다른사람입니다.");
	    }
	    System.out.println(k1);
	    System.out.println(k3);
	    System.out.println("----------------");
        String st1 = "홍길동";
        String st2 = "홍길동";
        String st3 = "박길동";
        if(st1.equals(st2)) {
	    	System.out.println("st1,st2는 같은 사람입니다.");
	    }else {
	    	System.out.println("st1,st2는 다른사람입니다.");
	    }
        System.out.println(st1);
        System.out.println(st2);
        
        if(st1.equals(st3)) {
	    	System.out.println("st1,st3는 같은 사람입니다.");
	    }else {
	    	System.out.println("st1,st3는 다른사람입니다.");
	    }
        System.out.println(st1);
        System.out.println(st3);
	    
	    

	}

}
