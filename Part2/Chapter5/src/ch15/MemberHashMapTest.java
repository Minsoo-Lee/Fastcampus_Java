package ch15;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberHong = new Member(1004, "Hong");
        Member memberLee = new Member(1001, "Lee");
        Member memberKim = new Member(1002, "Kim");
        Member memberKang = new Member(1003, "Kang");

        memberHashMap.addMember(memberHong);
        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberKang);

        memberHashMap.showAllMember();

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1001, "Kim");
        hashMap.put(1002, "Lee");
        hashMap.put(1003, "Park");
        hashMap.put(1004, "Hong");

        System.out.println(hashMap);
    }
}
