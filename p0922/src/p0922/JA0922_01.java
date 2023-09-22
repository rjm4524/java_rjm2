package p0922;

import java.util.ArrayList;

public class JA0922_01 {

	public static void main(String[] args) {
		
		ArrayList <StuScore> list = new ArrayList();//<> 지네릭스
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		list.add(new StuScore("홍길동",100,100,100));
		list.add(new StuScore("고길동",11,12,13));
		list.add(new StuScore("구길동",10,50,70));
		
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n",title[0],title[1],title[2],
				title[3],title[4],title[5],title[6],title[7]);
		
		for(int i=0; i<list.size();i++) {
			StuScore s = list.get(i); //형변환 생략가능. (StuScore)list.get(i);
			System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d \n"
					,s.getStuNum(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		   
		}

	}

}
