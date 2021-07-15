package ch16;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        int day;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 2: case 4: case 6: case 9: case 11:
                day = 28;
                break;
            default:
                System.out.println("존재하지 않는 달입니다.");
                day = -1;
        }
        System.out.println(month + "월은 " + day + "일 입니다.");

        // 자바 1.4부터 지원되는 Switch Expression
        /*
        int month = 3;

        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println("한 달은 31일입니다.");
                yield 31;
            }
            case 4, 6, 9, 11 -> {
                System.out.println("한 달은 30일입니다.");
                yield 30;
            }
            case 2 -> {
                System.out.println("한 달은 28일입니다.");
                yield 28;
            default -> {
                System.out.println("존재하지 않는 달 입니다.");
                yield 0;
            }
        }
         */
    }
}
