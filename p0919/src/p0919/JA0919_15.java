package p0919;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JA0919_15 {

	public static void main(String[] args) throws Exception {
		File f = new File("c:/bbb");
		if(!f.exists()) {//폴더가 없다면
			f.mkdir();//폴더를 생성
		}
			
		
		FileInputStream fis = new FileInputStream("c:/aaa/lee.jpg");
		FileOutputStream fos = new FileOutputStream("c:/bbb/lee.jpg");
		
		while(true) {
			int read = fis.read();//파일을 byte 단위로 읽어오기
			if(read == -1) break;{//파일이 더이상 읽을게 없으면 멈춤.
				fos.write(read);//파일을 byte 단위로 저장
			}
		}
		System.out.println("파일이 생성되었습니다. 1");
		FileInputStream fis2 = new FileInputStream("c:/aaa/lee2.jpg");
		FileOutputStream fos2 = new FileOutputStream("c:/bbb/lee2.jpg");
		
//		fis2.close();
//		fos2.close();
		
		
		while(true) {
			int read2 = fis2.read();
			if(read2 == -1) break;{
				fos2.write(read2);
			}
		}
		
		fis2.close();
		fos2.close();
		
		System.out.println("파일이 저장되었습니다.");

	}//main

}//class
