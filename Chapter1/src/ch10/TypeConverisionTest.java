package ch10;

public class TypeConverisionTest {
    public static void main(String[] args) {
        byte bNum = 125;
        int iNum = bNum;

        System.out.println(iNum);

        int iNum1 = 255;
        byte bNum1 = (byte)iNum;

        System.out.println(bNum);

        double dNum = 3.14;
        int iNum2 = (int) dNum;

        System.out.println(iNum2);

        double dNum1 = 1.2;
        float fNum = 0.9F;

        int iNum3 = (int)dNum1 + (int)fNum;
        int iNum4 = (int)(dNum1 + fNum);

        System.out.println(iNum3);
        System.out.println(iNum4);
    }
}
