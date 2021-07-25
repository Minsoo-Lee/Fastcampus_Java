package ch03;

public class InsertionSort {

    public static void insertionSort(int[] arr, int count) {
        int i=0, j=0;
        int tmp = 0;

        for (i=1; i<count; i++) {
            tmp = arr[i];
            j=i;

            while ((j>0) && (arr[j-1] > tmp)) {
                arr[j] = arr[j-1];
                j=j-1;
            }

            arr[j] = tmp;

            System.out.println("반복 - " + i);
            printSort(arr, count);
        }
    }

    public static void printSort(int value[], int count) {
        for (int i=0;i<count;i++) {
            System.out.print(value[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 50, 70, 80, 20, 40, 30, 60};
        printSort(arr, arr.length);
        insertionSort(arr, arr.length);
    }

}
