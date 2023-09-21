package p0921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class JA0921_04 {

	public static void main(String[] args) throws Exception  {
		ArrayList<StuScore> list = new ArrayList();
		// stu1.txt 파일의 내용을 list에 담기
		FileReader fr = new FileReader("c:/aaa/stu1.txt");
		BufferedReader br = new BufferedReader(fr);
		while (true) {
			String line = br.readLine();// 한줄 읽어오기
			if (line == null)
				break;
//list 담기	1.StuScore객체 생성, -> list담기 
			String[] arrDate = line.split(",");
			int stuNum = Integer.parseInt(arrDate[0]);
			String name = arrDate[1];
			int kor = Integer.parseInt(arrDate[2]);
			int eng = Integer.parseInt(arrDate[3]);
			int math = Integer.parseInt(arrDate[4]);
			int total = Integer.parseInt(arrDate[5]);
			double avg = Double.parseDouble(arrDate[6]);
			int rank = Integer.parseInt(arrDate[7]);
			list.add(new StuScore(stuNum,name,kor,eng,math,total,avg,rank));
			System.out.println(line);

		}
		br.close();
	}

}
