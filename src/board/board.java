package board;

import java.util.*;

public class board {
	Scanner sc = new Scanner(System.in);
	public Map<Integer, String[]> board = new HashMap<>();
	int cnt = 1;

	public void insert() {
		String[] bod = new String[3];
		System.out.print("아이디를 입력해주세요 : ");
		bod[0] = sc.next();
		System.out.println("제목을 입력해주세요 : ");
		bod[1] = sc.nextLine();
		System.out.println("내용을 입력해주세요 : ");
		bod[3] = sc.nextLine();

		board.put(cnt++, bod);
	}

	public void delete() {
		System.out.print("삭제할 글의 번호를 입력해주세요 : ");
		int num = sc.nextInt();
		Iterator<Integer> it = board.keySet().iterator();

		while (it.hasNext()) {
			int key = it.next();
			if (key == num) {
				board.remove(key);
				System.out.println("삭제");
				return;
			}
		}

		System.out.println("없습니다.");
	}

	public void search() {
		System.out.print("이동할 작성글의 번호를 입력해주세요 : ");
		int number = sc.nextInt();
		Iterator<Integer> it = board.keySet().iterator();

		while (it.hasNext()) {
			int key = it.next();
			if(key == number) {
				System.out.println("해당글이 존재합니다");
				return;

			}
			System.out.println("해당글이 없습니다.");
		}
	}   
}    