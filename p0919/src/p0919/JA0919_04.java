package p0919;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;

public class JA0919_04 {

	public static void main(String[] args) {
		File f = new File("C:\\다운로드/aaa.txt");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			
		}
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter writer = new BufferedWriter(fw);
			writer.write("안녕하세요. 반갑습니다. 다음에 뵙겠습니다.\r\n두번째 줄입니다. \r\n");
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일이 생성되었습니다.");

	}

}
