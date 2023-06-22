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

        int cmd;
        boolean flag = true;

        while (flag) {
            System.out.print("\n명령어 입력\n>> ");
            cmd = sc.nextInt();

            switch (cmd) {
                default :
                    break;
            }
            break;
        }

    }
}
