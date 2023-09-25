package p0925;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class StuMain0925 {

	public static void main(String[] args) throws Exception {
		StuAction0925 s = new StuAction0925();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		while (true) {
			System.out.println("-------------------------");
			System.out.println("[학생성적처리 프로그램");
			System.out.println("-------------------------");
			System.out.println("1. 학생입력");
			System.out.println("2.학생성적 출력");

			System.out.println("3.학생성적수정");
			System.out.println("4.학생성적 삭제");

			System.out.println("5.이름순 정렬 출력");
			System.out.println("6.학생높은 순 출력");
			System.out.println("7.성적낮은 순 정렬");
			System.out.println("8.파일가져오기");
			System.out.println("9.파일 저장");

			System.out.println("10.등수처리");
			System.out.println("0.프로그램 종료");
			System.out.println("-------------------------");
			choice = scan.nextInt();

			switch (choice) {

			case 1:
				while (true) {
					int count = s.list.size() + 1;
					System.out.println(count + "번째 학생 이름을 입력해주세요.(0.이전페이지로 이동>>)");
					String name = scan.next();
					if (name.equals("0")) {
						System.out.println("이전페이지로 돌아갑니다.");
						break;
					}
					System.out.println("국어성적을 입력해주세요.");
					int kor = scan.nextInt();
					System.out.println("영어성적을 입력해주세요.");
					int eng = scan.nextInt();
					System.out.println("수학성적을 입력해주세요.");
					int math = scan.nextInt();
					s.list.add(new StuScore0925(name, kor, eng, math));
					System.out.println("저장되었습니다.");
				}
				break;

			case 2:
				System.out.println("[학생 성적 출력]");
				System.out.printf("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\t\n");
				System.out.println("--------------------");
				System.out.println();
				for (int i = 0; i < s.list.size(); i++) {
					StuScore0925 st = s.list.get(i);
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t\n", st.getStuNum(), st.getName(), st.getKor(),
							st.getEng(), st.getMath(), st.getTotal(), st.getAvg(), st.getRank());
				}
				System.out.println();
				break;
			case 3:
				while (true) {

					System.out.println("[학생 성적 수정]");
					System.out.println("수정하실 학생이름을 입력해주세요.(0.다시 입력)");
					String inputName = scan.next();
					if (inputName.equals("0")) {
						System.out.println("다시입력해주세요.");
					}
					System.out.println("입력된 이름을 찾고있습니다..");
					int i = 0;
					int count = 0;
					for (i = 0; i < s.list.size(); i++) {
						StuScore0925 st = s.list.get(i);
						if (inputName.equals(st.getName()))
							;
						System.out.println("입력된 학생이 검색되었습니다.");
						count = 1;
						break;
					}
					if (count == 0) {
						System.out.println("입력된 학생을 찾을수 없습니다. 다시입력해주세요.");
						continue;
					}
					System.out.println("1.국어");
					System.out.println("2.영어");
					System.out.println("3.수학");
					System.out.println("수정을 원하시는 과목을 선택해주세요.>>수정완료시 0.");
					choice = scan.nextInt();
					loop2: switch (choice) {

					case 1:
						System.out.println("수정할 점수를 입력해주세요.");
						System.out.println("-------------------");
						System.out.println("현재 국어점수 :" + s.list.get(i).getKor());
						System.out.println("변경할 국어점수를 입력해주세요");
						s.list.get(i).setKor(scan.nextInt());
						s.list.get(i)
								.setTotal(s.list.get(i).getKor() + s.list.get(i).getEng() + s.list.get(i).getMath());
						s.list.get(i).setAvg(s.list.get(i).getTotal() / 3.0);
						System.out.println("점수가 변경되었습니다. (변경된 점수 :" + s.list.get(i).getKor());
						break;

					case 2:
						System.out.println("수정할 점수를 입력해주세요.");
						System.out.println("-------------------");
						System.out.println("현재 영어점수 :" + s.list.get(i).getEng());
						System.out.println("변경할 영어점수를 입력해주세요");
						s.list.get(i).setEng(scan.nextInt());
						s.list.get(i)
								.setTotal(s.list.get(i).getKor() + s.list.get(i).getEng() + s.list.get(i).getMath());
						s.list.get(i).setAvg(s.list.get(i).getTotal() / 3.0);
						System.out.println("점수가 변경되었습니다. (변경된 점수 :" + s.list.get(i).getEng());
						break;
					case 3:
						System.out.println("수정할 점수를 입력해주세요.");
						System.out.println("-------------------");
						System.out.println("현재 수학점수 :" + s.list.get(i).getMath());
						System.out.println("변경할 수학점수를 입력해주세요");
						s.list.get(i).setMath(scan.nextInt());
						s.list.get(i)
								.setTotal(s.list.get(i).getKor() + s.list.get(i).getEng() + s.list.get(i).getMath());
						s.list.get(i).setAvg(s.list.get(i).getTotal() / 3.0);
						System.out.println("점수가 변경되었습니다. (변경된 점수 :" + s.list.get(i).getMath());
						break;
					case 0:
						System.out.println("이전 페이지로 돌아갑니다.");
						break loop2;
					}
				}
			case 5:
				System.out.println("이름순 정렬을 하시겠습니까?");
				System.out.println("1.예 2.아니요");
				int Sc = scan.nextInt();
				if (Sc == 1) {
					Collections.sort(s.list, new Comparator<StuScore0925>() {

						public int compare(StuScore0925 s1, StuScore0925 s2) {
							return s1.getName().compareTo(s2.getName());
						}
					});
					System.out.println("이름순 정렬이 완료되었습니다.");
					break;
				}
				if (Sc == 2) {
					System.out.println("이전페이지로 돌아갑니다.");
					break;
				}
			case 6:
				System.out.println("성적 높은순 정렬을 하시겠습니까?");
				int Sc1 = scan.nextInt();
				System.out.println("1.예 2.아니요");
				if (Sc1 == 1) {
					Collections.sort(s.list, new Comparator<StuScore0925>() {

						public int compare(StuScore0925 s1, StuScore0925 s2) {
							return s2.getTotal() - s1.getTotal();
						}
					});
					System.out.println("성적 높은순 정렬이 완료되었습니다.");

				} else if (Sc1 == 2) {
					System.out.println("이전페이지로 돌아갑니다.");
					break;
				}
			case 7: 
				System.out.println("성적 낮은순 정렬을 하시겠습니까?");
				int Sc2 = scan.nextInt();
				System.out.println("1.예 2.아니요");
				if (Sc2 == 1) {
					Collections.sort(s.list, new Comparator<StuScore0925>() {

						public int compare(StuScore0925 s1, StuScore0925 s2) {
							return s1.getTotal() - s2.getTotal();
						}
					});
					System.out.println("성적 낮은순 정렬이 완료되었습니다.");

				} else if (Sc2 == 2) {
					System.out.println("이전페이지로 돌아갑니다.");
					break;
				}
			case 8:
				FileReader fr = new FileReader("c:/aaa/stu2.txt");
				BufferedReader bf = new BufferedReader(fr);
				while(true) {
					String line = bf.readLine();
					if(line==null) break;
					String[] data = line.split(",");
					int stuNum = Integer.parseInt(data[0]);
					String name = data[1];
					int kor = Integer.parseInt(data[2]);
					int eng = Integer.parseInt(data[3]);
					int math = Integer.parseInt(data[4]);
					int total = Integer.parseInt(data[5]);
					double avg = Double.parseDouble(data[6]);
					int rank = Integer.parseInt(data[7]);
					s.list.add(new StuScore0925(stuNum,name,kor,eng,math,total,avg,rank));
				}
				bf.close();
				System.out.println("입력된 파일을 가져왔습니다.");
				System.out.println();
				
			case 9: 
				
				FileWriter fw = new FileWriter("c:/aaa/stu2.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				String studata = "";
				for(int i=0; i<s.list.size(); i++) {
					
				}
				

			}// while

		}

	}

}
