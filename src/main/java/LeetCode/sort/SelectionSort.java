package LeetCode.sort;

/**
 * @Description:
 * @Author: csc
 * @Create: 2024-01-16
 */
public class SelectionSort {
    /**
     * 选择排序
     * @param arr
     * @return arr
     */
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
        return arr;
    }
}
