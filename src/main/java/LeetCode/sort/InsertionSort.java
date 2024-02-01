package LeetCode.sort;

/**
 * @Description:
 * @Author: csc
 * @Create: 2024-01-16
 */
public class InsertionSort {
    /**
     * 插入排序
     * @param arr
     * @return arr
     */
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int preIndex = i - 1;
            int current = arr[i];
            while (preIndex >= 0 && current < arr[preIndex]) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex -= 1;
            }
            arr[preIndex + 1] = current;
        }
        return arr;
    }
}
