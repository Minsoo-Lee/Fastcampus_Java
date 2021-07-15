package ch14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<>(new Member());
    }
    // Member에 Comparator를 쓸 경우 우항의 괄호 안에 new Member로 지정해주어야 함
    public void addMember(Member member) {
        treeSet.add(member);
    }
    public boolean removeMember(int memberId) {
        /*
        for (int i = 0; i<arrayList.size();i++) {
            Member member = arrayList.get(i);

            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(i);
                return true;
            }
        } */

        Iterator<Member> ir = treeSet.iterator();
        while (ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }
    public void showAllMember() {
        for (Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();
    }

}
