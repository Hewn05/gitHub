package collectionFramework2Prac;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CompareMemberTreeMap {
	private TreeMap<Member, Point> tMap;

	public CompareMemberTreeMap() {
		tMap = new TreeMap<Member, Point>();
	}

	public void addMember(Member member, Point point) {
		tMap.put(member, point);
	}

	public boolean removeMember(int memberID) {
//		for (Entry<Member, Point> entry : tMap.entrySet()) {
//			if (entry.getKey().getMemberID().equals(memberID)) {
//				tMap.remove(entry.getKey());
//				return true;
//				}
//		}
//		return false;
		Iterator<Member> iter = tMap.keySet().iterator();
		
		while(iter.hasNext()) {
			Member m = iter.next();
			if(m.getMemberID().equals(memberID)) {
				tMap.remove(m);
				return true;
			}
		}
		return false;
		
		
	}

	public void showAll() {
		for (Entry<Member, Point> entry : tMap.entrySet()) {
			Member m = entry.getKey();
			Point p = entry.getValue();
			System.out.print(m.toString());
			System.out.println(p.toString());
		}
	}

	public TreeMap<Member, Point> gettMap() {
		return tMap;
	}

	public void settMap(TreeMap<Member, Point> tMap) {
		this.tMap = tMap;
	}

}
