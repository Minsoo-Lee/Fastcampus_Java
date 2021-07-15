package ch13;

public class MemberHashSetTest {
    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();
        Member memberLee = new Member(1001, "Lee");
        Member memberKim = new Member(1002, "Kim");
        Member memberKang = new Member(1003, "Kang");


        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberKang);

        Member memberHong = new Member(1003, "Hong");
        // equals, hashCode()를 오버라이딩 할 것
        memberHashSet.addMember(memberHong);

        memberHashSet.showAllMember();
    }
}
