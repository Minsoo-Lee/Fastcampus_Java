package ch11;

public class MemberArrayListTest {

    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();
        Member memberLee = new Member (1001, "Lee");
        Member memberKim = new Member (1001, "Kim");
        Member memberKang = new Member (1001, "Kang");
        Member memberHong = new Member (1001, "Hong");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberKang);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMember();
        memberArrayList.removeMember(memberKim.getMemberId());
        memberArrayList.showAllMember();
    }
}
