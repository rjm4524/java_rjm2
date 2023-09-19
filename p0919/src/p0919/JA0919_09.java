package p0919;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class JA0919_09 {

	public static void main(String[] args) {
		
		
	

		try {
			InputStream is = new FileInputStream("c:aaa/1.txt");
			
		}
			int read = 0;
			while((read=is.read()) != -1) {
				System.out.println((char)read);
			}
			
			
			
//			while (true) {
//				int read = is.read();
//				if(read<0) {
//					break;
//				}
//				System.out.println((char)read);
//			}
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}

//		try {
//			byte[] b = new byte[1024];
//			InputStream is = new FileInputStream("c:/aaa/1.txt");
//				is.read(b);
//				System.out.print(new String (b));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
	


	}

}
