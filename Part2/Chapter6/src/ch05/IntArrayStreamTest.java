package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println();

        Arrays.stream(arr).forEach(n-> System.out.println(n)); // forEach 안에 람다식으로 작성
        System.out.println();

        IntStream is = Arrays.stream(arr);
        is.forEach(n-> System.out.println(n)); // is는 재사용 불가능 (새로 다시 정의해주어야 함
        System.out.println();

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
