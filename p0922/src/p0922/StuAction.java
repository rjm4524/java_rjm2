package p0922;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StuAction {
	
	ArrayList<StuScore> list = new ArrayList();
    Scanner scan = new Scanner (System.in);

	
	
	//1. 학생성적입력 메소드
	void StuInput() {
		while(true) {
			
			int count = list.size()+1;
			System.out.println("[학생성적 입력]");
			System.out.println(count+"번째 학생이름을 입력하세요.(0.이전 페이지 이동)");
			String name = scan.next();
			if(name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
				
			}
			System.out.println("국어성적을 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("영어성적을 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학성적을 입력하세요.");
			int math = scan.nextInt();
			list.add(new StuScore(name,kor,eng,math)); //매개변수가 4개인 생성자 사용 
			System.out.println("학생 성적이 저장되었습니다 !");
		}
		
	}//StuInput
	//2.학생 성적 출력
	void StuOutput() {
		System.out.println("[학생성적 출력]");
		System.out.printf("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\t\n");
		System.out.println("-----------------------");
		System.out.println();
		for(int i=0; i<list.size();i++) {
			StuScore st = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t\n"
				,st.getStuNum(),st.getName(),st.getKor(),st.getEng(),st.getMath()
				,st.getTotal(),st.getAvg(),st.getRank());
		}
		System.out.println();
		
		
	}//StuOutput
	
	
	//3.학생성적 수정
	void stuUpdate() {
		 while(true) {
         	System.out.println("[학생성적 수정]");
         	System.out.println("수정을 원하는 학생이름을 입력하세요.(0.이전페이지)");
         	String inputName = scan.next();
         	if(inputName.equals("0")) {
         		System.out.println("이전페이지로 이동합니다");
         		System.out.println();
         		break;
         	}
         	System.out.println("입력된 이름으로 검색중...");
         	// list안에 이름이 모두있음
         	int i = 0;// 검색되었을때 위치점을 저장하는 변수
         	int count = 0;// 찾는 학생이 있는지 확인하는 변수
         	
         	for (i = 0;i<list.size(); i++) {
         		StuScore st = list.get(i);
         		if (inputName.equals(st.getName())) {
         			System.out.println("입력된 이름으로 학생이 검색 되었습니다.");
         			count = 1;
         			
         			break; //for
         		} // if
         	} // for
         	if (count == 0) {//검색된 이름이 없으면 실행이 됨.
         		System.out.println("학생을 찾을수 없습니다. 다시 입력해주세요");
         		continue; //switch
         	}
         	
         	System.out.println("-------------\n");
         	System.out.println("1.국어점수");
         	System.out.println("2.영어점수");
         	System.out.println("3.수학점수");
         	System.out.println("--------------");
         	System.out.println("원하시는 번호를 입력하세요.>>");
         	int choice = scan.nextInt();
         	loop2: switch (choice) {
         	case 1:
         		System.out.println("수정하실 점수를 입력해주세요.");
         		System.out.println("----------------");
         		System.out.println("현재 국어점수 :"+list.get(i).getKor());
         		System.out.println("변경할 국어점수를 입력하세요.>>");
         		list.get(i).setKor(scan.nextInt());
         		list.get(i).setTotal(list.get(i).getKor()
         				+list.get(i).getEng()
         				+list.get(i).getMath());
         		list.get(i).setAvg(list.get(i).getKor()
         				+list.get(i).getEng()
         				+list.get(i).getMath());
         		System.out.println("-----------------");
         		System.out.printf("국어점수: %d점으로 수정되었습니다.",list.get(i).getKor());
         		
         		break;
         	case 2:
         		System.out.println("수정하실 점수를 입력해주세요.");
         		System.out.println("----------------");
         		System.out.println("현재 영어점수 :"+list.get(i).getEng());
         		System.out.println("변경할 영어점수를 입력하세요.>>");
         		list.get(i).setEng(scan.nextInt());
         		list.get(i).setTotal(list.get(i).getKor()
         				+list.get(i).getEng()
         				+list.get(i).getMath());
         		list.get(i).setAvg(list.get(i).getKor()
         				+list.get(i).getEng()
         				+list.get(i).getMath());
         		System.out.println("-----------------");
         		System.out.printf("영어점수: %d점으로 수정되었습니다.",list.get(i).getEng());
         		break;
         	case 3:
         		System.out.println("수정하실 점수를 입력해주세요.");
         		System.out.println("----------------");
         		System.out.println("현재 수학점수 :"+list.get(i).getMath());
         		System.out.println("변경할 수학점수를 입력하세요.>>");
         		list.get(i).setMath(scan.nextInt());
         		list.get(i).setTotal(list.get(i).getKor()
         				+list.get(i).getEng()
         				+list.get(i).getMath());
         		list.get(i).setAvg(list.get(i).getKor()
         				+list.get(i).getEng()
         				+list.get(i).getMath());
         		System.out.println("-----------------");
         		break;
         		
         	case 0:
         		System.out.println("프로그램을 종료합니다.");
         		break loop2;
         		
         	}
         	
         }
		
	}//stuUpdate
	
	
	void stuFopen() throws Exception {
		FileReader fr = new FileReader("c:/aaa/stu2.txt");
		BufferedReader br = new BufferedReader(fr);
	    while(true) {
	    	String line = br.readLine();
	    	if(line==null) break;
	    		String[] data = line.split(","); //각 데이터 값을 ,로 분리 
	    		int stuNum = Integer.parseInt(data[0]);
	    		String name = data[1];
	    		int kor = Integer.parseInt(data[2]);
	    		int eng = Integer.parseInt(data[3]);
	    		int math = Integer.parseInt(data[4]);
	    		int total = Integer.parseInt(data[5]);
	    		double avg = Double.parseDouble(data[6]);
	    		int rank = Integer.parseInt(data[7]);
	    		list.add(new StuScore(stuNum,name,kor,eng,math,total,avg,rank));//전체 생성자 사용
	    	
	    }
	    br.close();
		System.out.println("입력된 파일을 가져왔습니다 !");
		System.out.println();
	}//stuFopen
	
	//9.파일 저장하기
	void stuFsave() throws Exception {
		FileWriter fw = new FileWriter("c:/aaa/stu2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String strdata = "";
		for (int i = 0; i < list.size(); i++) {
			StuScore st = list.get(i);
			String line = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d", st.getStuNum(), st.getName(), st.getKor(),
					st.getEng(), st.getMath(), st.getTotal(), st.getAvg(), st.getRank());
			strdata += line+"\r\n"; //1명의 학생성적을 String으로 변환후 strdata에 추가해줌.
			// System.out.println(line);
		}

		bw.write(strdata);
		bw.close();
		System.out.println("파일을 저장했습니다.!");
	}//stuFsave
	
	//이름순 정렬
    void stuNameSort() {
    	Collections.sort(list,new Comparator<StuScore>() {

			public int compare(StuScore s1, StuScore s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
    	System.out.println("이름순 정렬이 완료되었습니다 !");
    }
	
	//높은점수 정렬
	void stuTotalhighSort () {
		Collections .sort(list,new Comparator<StuScore>() {

			public int compare(StuScore s1, StuScore s2) {
				return s2.getTotal() - s1.getTotal();
			}
		});
		System.out.println("성적 높은 순 정렬이 완료되었습니다!");
	}//stuTotalhighSort
	
	void stuTotalLowSort () {
		Collections .sort(list,new Comparator<StuScore>() {

			public int compare(StuScore s1, StuScore s2) {
				return s1.getTotal() - s2.getTotal();
			}
		});
		System.out.println("성적 낮은 순 정렬이 완료되었습니다!");
	}//stuTotalLowSort
	
	
	
	
	
	
	
	
	
	

	
		// TODO Auto-generated method stub
		
	}

