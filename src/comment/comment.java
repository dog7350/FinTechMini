<<<<<<< HEAD
package comment;

import java.util.*;

public class comment {
    public Map<Integer, String[]> comment = new HashMap<>();

    public void insert() {

    }

    public void delete() {

    }

    public void search() {

    }
=======
package comment; //댓글관리(작성,삭제, 검색)

import java.util.*;
import member.member;

public class comment {
	Scanner input = new Scanner(System.in);
    public Map<Integer, Object[]> comment = new HashMap<>();	
    private int cno = 1;//댓글번호

    public void insert(String id, int bno) {//게시글종속, 게시글번호,
    	Object[] obj = new Object[3];
    	obj[0]=bno;//게시글번호
    	obj[1]=id;//아이디
    	System.out.println("댓글을 입력하세요\n>> ");
    	obj[2]=input.next();//댓글입력
    	comment.put(cno++,obj);
    	System.out.println(comment.get(bno)[2]);
    }

    public void delete(member member) {
    	Iterator<Integer> it = member.member.keySet().iterator();
    	System.out.println("삭제할 댓글의 아이디 입력\n>>");
    	String id = input.next();
    	
    	while (it.hasNext()) {
    		int key = it.next();
    		if (member.member.get(key)[1].equals(id)) {
    			comment.remove(key);
    			System.out.println("댓글이 삭제되었습니다.");
    			return;
    		}
    	}
    	
    	System.out.println("없습니다.");
    }

    public void search(member member) {
    	Iterator<Integer> it = member.member.keySet().iterator();
    	System.out.println("검색할 댓글의 아이디 입력\n>>");
    	String id = input.next();
    	
    	while(it.hasNext()) {
    		int key = it.next();
    		if(member.member.get(key).equals(id)) {
    			System.out.println(comment.get(key)[2]);
    			return;
    		}
    	}
    	
    	System.out.println("없습니다.");
    	
    }
    
>>>>>>> 346110cf50dfbac22c2ab2c204f6c072b3359fb9
}
