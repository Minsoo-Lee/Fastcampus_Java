package ch04;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MyNumberTest {
    public static void main(String[] args) {
        MyNumber myNumber = (x, y) -> x > y ? x : y;
        System.out.println(myNumber.getMax(10, 20));
    }



}
