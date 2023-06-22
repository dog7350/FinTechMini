import java.util.*;

import board.board;
import comment.comment;
import event.event;
import member.member;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        board board = new board();
        comment comment = new comment();
        member member = new member();
        event event = new event();

        /*
            1. 회원 관리 (가입, 검색, 탈퇴)
            2. 게시글 관리 (작성, 삭제, 검색)
            3. 댓글 관리 (작성, 삭제, 검색)
            4. 이벤트 (추가, 삭제, 추첨)
        */

        
        comment.insert("jaeyeon", 1);
        
        
        
        /*
        int cmd;
        boolean flag = true;

        while (flag) {
            System.out.print("\n1. 회원관리(가입, 검색, 탈퇴)\n2. 게시글 관리(작성, 검색, 삭제)\n3. 댓글 관리(작성, 검색, 삭제)\n4. 이벤트(추가, 삭제, 추첨)\n5. 프로그램 종료\n명령어 입력\n>> ");
            cmd = sc.nextInt();

            switch (cmd) {
                case 1 :
                	System.out.print("\n1.가입, 2.검색, 3.탈퇴\n명령어 입력\n>>");
                	cmd = sc.nextInt();
                    
                	switch(cmd) {
                	case 1 : member.join(); break;
                	case 2: member.search(); break;
                	case 3 : member.drop(); break;
                	default :
                        System.out.print("\n올바른 명령어를 입력하세요.\n");
                        break;
                	}
                    break;
                case 2 :
                    // 내용
                    break;
                case 3 :
                    // 내용
                    break;
                case 4 :
                    // 내용
                    break;
                case 5 :
                    flag = false;
                    System.out.print("\n프로그램 종료\n");
                    break;
                default :
                    System.out.print("\n올바른 명령어를 입력하세요.\n");
                    break;
            }
        }
        */

    }
}
