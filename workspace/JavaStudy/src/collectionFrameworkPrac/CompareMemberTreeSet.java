package collectionFrameworkPrac;

import java.util.*;

public class CompareMemberTreeSet {
	public TreeSet<Member> tset;
	
	public CompareMemberTreeSet() {
		tset = new TreeSet<Member>();
	}
	
	public void addMember(Member mem) {
		tset.add(mem);
	}

	public void removeMember(int memberID){
		for(Member mem : tset) {
			if(mem.getMemberID() == memberID) {
				tset.remove(mem);
				System.out.println("삭제");
				return;
			}
		}
		System.out.println("삭제 못함");
	}
	
	public void deleteMember(int memberID) {
		Iterator<Member> iter = tset.iterator();
		while(iter.hasNext()) {
			if(iter.next().getMemberID() == memberID) {
				iter.remove();
				return;
			}
		}
		
	}
	
	
	public void showAll() {
		for(Member mem : tset) {
			System.out.print("ID:"+mem.getMemberID());
			System.out.print("/이름:"+mem.getName());
			System.out.println("/나이:"+mem.getAge());
		}
	}
}
