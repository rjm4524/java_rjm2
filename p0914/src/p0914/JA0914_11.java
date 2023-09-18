package p0914;

import java.util.ArrayList;
import java.util.Scanner;

public class JA0914_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList list = new ArrayList();

		list.add(new Member("aaa", "1111", "류진민", "서울", "010-3029-1021"));
		list.add(new Member("bbb", "2222", "류진민", "서울", "010-3029-1021"));
		list.add(new Member("ccc", "3333", "류진민", "서울", "010-3029-1021"));
		list.add(new Member("ddd", "4444", "류진민", "서울", "010-3029-1021"));
		list.add(new Member("eee", "5555", "류진민", "서울", "010-3029-1021"));

		System.out.println("[ 하이마켓 쇼핑몰 로그인 ]");
		String id = "";
		String pw = "";
		String name = "";

		loop: while (true) {

			System.out.println("아이디를 입력하세요.");
			id = scan.next();
			System.out.println("패스워드를 입력하세요.");
			pw = scan.next();

			int check = 0;
			for (int i = 0; i < list.size(); i++) {

				Member Ma = (Member) list.get(i);
				if (id.equals(Ma.getId()) && pw.equals(Ma.getPw())) {
					System.out.println("로그인을 진행합니다.");
					name = Ma.getName();
					System.out.println();
					check = 1;
					break loop;

				}
			} // for
				// check = 1;
			if (check == 0) {
				System.out.println("아이디 혹은 패스워드가 불일치합니다.");
				System.out.println();
			}

		} // while
		Buyer b1 = new Buyer(id, name);
		int choice = 0;
		while (true) {
			System.out.println("[하이마켓 가전 쇼핑몰]");
			System.out.println("1.Tv");
			System.out.println("2.컴퓨터");
			System.out.println("3.오디오");
			System.out.println("4.세탁기");
			System.out.println("5.현재 잔액조회");
			System.out.println("8.장바구니");
			System.out.println("9.총 구매목록");
			System.out.println("0.쇼핑몰 페이지 닫기");
			System.out.println("------------------");
			System.out.println("구매를 원하는 번호를 입력하세요.");
			choice = scan.nextInt();

			switch (choice) {
			
			case 1:
				System.out.println("[Tv 구매]");
				System.out.println("결제를 진행할까요?(1.예 2.아니요.)");
				choice = scan.nextInt();
			    if(choice == 1) {
			    	System.out.println("Tv를 구매하셨습니다.");
			    	b1.buy(new Tv());
			    	System.out.printf("구매후 남은 잔액: %,d원\n",b1.money);
			    }if(choice == 2) {
			    	System.out.println("메뉴로 돌아갑니다.");
			    }
				break;

			case 5:
				System.out.println("[잔액 조회]");
				System.out.println("---------------");
				System.out.printf("%s님의현재 잔액 :%,d원\n", b1.name, b1.money);
				break;

			}// switch

		} // while
	}

}
