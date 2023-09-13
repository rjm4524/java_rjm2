package p0913;



import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class JA0913_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//날짜 객체 1.
		Date today = new Date();
		System.out.println(today);
		int[] a = {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		//format 설정/MM/dd
		
		//날짜객체 2.
		Calendar ca1 = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		java.lang.String str = new String("a");
		//System.out.println(sdf.format(ca1.clone("yyyy년MM월dd일")));
		 SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		 System.out.println(sdf1.format("yyyy/MM/dd hh:mm:ss"));
		
	}

}
