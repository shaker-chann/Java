package LeetCode.sort;

import java.util.Arrays;

/**
 * @Description:
 * @Author: csc
 * @Create: 2024-01-15
 */
public class ShellSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shellSort(new int[]{6, 4, 5, 7, 2, 8, 3, 0, 9, 1})));
    }

    public static int[] shellSort(int[] arr) {
        int n = arr.length;
        int gap = n / 2;
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int current = arr[i];
                int preIndex = i - gap;
                // Insertion sort
                while (preIndex >= 0 && arr[preIndex] > current) {
                    arr[preIndex + gap] = arr[preIndex];
                    preIndex -= gap;
                }
                arr[preIndex + gap] = current;

            }
            gap /= 2;
        }
        return arr;
    }


}
