package event;

import java.util.*;
import member.member;

public class event {
	Scanner sc = new Scanner(System.in);
	
    public Map<Integer, String[]> event = new HashMap<>();
    int cnt = 1;

    public void add() {
    	String[] evt = new String[2];
    	System.out.print("\n추가할 이벤트명\n>> ");
    	evt[0] = sc.next();
    	System.out.print("\n이벤트 내용\n>> ");
    	evt[1] = sc.next();
    	event.put(cnt++, evt);
    	System.out.print("\n이벤트가 추가되었습니다");
    }

    public void delete() {
    	String name;
    	System.out.println("삭제할 이벤트명\n>> ");
    	name = sc.next();
    	
    	Iterator<Integer> it = event.keySet().iterator();
    	while (it.hasNext()) {
    		int id = it.next();
    		
    		if (event.get(id)[0].equals(name)) {
    			event.remove(id);
    			System.out.print("\n삭제되었습니다.");
    			return;
    		}
    	}
    	
    	System.out.print("\n이벤트가 존재하지 않습니다.");
    }

    public void exec(member member) {
    	System.out.println("★ 이벤트 목록 ★\n");
    	Iterator<Integer> eit = event.keySet().iterator();
    	Iterator<Integer> mit = member.member.keySet().iterator();
    	
    	int no = 1, eno;
    	while (eit.hasNext()) {
    		int id = eit.next();
    		System.out.println(no + ". " + event.get(id));
    		no++;
    	}
    	
    	System.out.print("\n이벤트 번호를 고르세요.\n>> ");
    	eno = sc.nextInt();
    	
    	System.out.print("\n모든 사용자를 대상으로 추첨을 시작합니다.\n");
    	int num = new Random().nextInt(member.member.size()) + 1;
    	while (mit.hasNext()) {
    		int key = mit.next();
    		if (key == num) {
    			System.out.println(member.member.get(key)[1] + "님께서 " + event.get(eno)[0] + " 이벤트에 선정되셨습니다.");
    			return;
    		}
    	}
    	
    	System.out.println(event.get(eno)[0] + "이벤트에 선정된 사용자가 없습니다.");
    }
    
    public void print() {
    	Iterator<Integer> it = event.keySet().iterator();
    	
    	int num = 1;
    	while (it.hasNext()) {
    		int key = it.next();
    		
    		System.out.println("\n" + num + ". 이벤트 명 : " + event.get(key)[0]);
    		System.out.println("이밴트 내용\n" + event.get(key)[1] + "\n");
    		num++;
    	}
    }
}
