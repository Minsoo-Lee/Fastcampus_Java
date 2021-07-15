package ch10;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class ConstantTest {
    public static void main(String[] args) {
        // final 키워드를 사용하면 상수로 지정 가능: 재지정 불가
        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        // MAX_NUM = 100;
    }
}
