//Реализовать алгоритм пирамидальной сортировки (сортировка кучей).
/**
 * tsk1
 */

// 2*i+1 и 2*i+2
public class tsk1 {

    public static void main(String[] args) {
        int arr[] = { 14, 61, 85, 24, 74, 26, 17, 50, 40, 45, 21, 32, 59, 58, 13};
        PrintArr(arr);
        System.out.println();
        for (int i = arr.length; i >0; i--) {
            PyramidSort(arr, i);
        }
        PrintArr(arr);


    }

    public static void PyramidSort(int arr[], int lastPoint) {
        for (int i = lastPoint / 2; i >= 0; i--) {
            if ((2 * i + 1 < lastPoint) && (2 * i + 2 < lastPoint)) {
                int maxIndex = 0;
                if (arr[2 * i + 1] >= arr[2 * i + 2]) {
                    maxIndex = 2 * i + 1;
                } else if (arr[2 * i + 1] < arr[2 * i + 2]) {
                    maxIndex = 2 * i + 2;
                }
                if (arr[maxIndex] > arr[i]) {
                    Swap(arr, i, maxIndex);
                }
            } else if ((2 * i + 1 < lastPoint)) {
                if (arr[2 * i + 1] > arr[i]) {
                    Swap(arr, i, 2 * i + 1);
                }
            }
        }
        Swap(arr, 0, lastPoint-1);
    }

    public static void Swap(int arr[], int firIndex, int secIndex) {
        int temp = 0;
        temp = arr[firIndex];
        arr[firIndex] = arr[secIndex];
        arr[secIndex] = temp;
    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}