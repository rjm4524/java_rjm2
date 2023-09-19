package p0919;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class JA0919_6 {

	public static void main(String[] args) throws Exception{
		File f = new File("C:\\다운로드/aaa.txt");
		if (!f.exists()) {
			f.createNewFile();
			
		}
			FileWriter fw = new FileWriter(f);
			BufferedWriter writer = new BufferedWriter(fw);
			writer.write("안녕하세요. 반갑습니다. 다음에 뵙겠습니다.\r\n두번째 줄입니다. \r\n");
			writer.close();
	
		
		System.out.println("파일이 생성되었습니다.");

	}

}
