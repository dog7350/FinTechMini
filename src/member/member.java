package member;

import java.util.*;

public class member {
    public Map<Integer, String[]> member = new HashMap<>();
    int cnt = 1;
  	Scanner sc = new Scanner(System.in);
  	
  	public String id;

    public void join() {
    	String[] mem = new String[3];
   
    	System.out.print("이름 입력 : ");
    	mem[0] = sc.next();
    	System.out.print("아이디 입력 : ");
    	mem[1] = sc.next();
    	System.out.print("비밀번호 입력 : ");
    	mem[2] = sc.next();
    	
    	member.put(cnt++, mem);
    }

    public void drop() {
    	System.out.print("아이디 입력 : ");
    	id = sc.next();
    	
    	Iterator<Integer> it = member.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();
			if( member.get(key)[1].equals(id) ) {
				member.remove(key);
				System.out.println("삭제 되었습니다.");
				return;
			}
		}
		System.out.print("아이디가 존재하지 않습니다.");
    }

    public void search() {
    	System.out.print("아이디 입력 : ");
    	id = sc.next();
    	
    	Iterator<Integer> it = member.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();
			if( member.get(key)[1].equals(id) ) {
				System.out.println("아이디가 존재합니다.");
				return;
			}
		}
		System.out.print("아이디가 존재하지 않습니다.");
    }
}
