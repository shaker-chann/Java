package LeetCode.sort;

import java.util.Arrays;

/**
 * @Description:
 * @Author: csc
 * @Create: 2024-01-16
 */
public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int position = partition(array, low, high);
            quickSort(array, low, position - 1);
            quickSort(array, position + 1, high);
        }
    }

    //执行后array[high]为中心，左边都比array[high]小，右边都比array[high]大
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int pointer = low;
        for (int i = low; i < high; i++) {
            //小于pivot的都移动到最左边
            if (array[i] <= pivot) {
                int temp = array[i];
                array[i] = array[pointer];
                array[pointer] = temp;
                pointer++;
            }
            System.out.println(Arrays.toString(array));
        }
        int temp = array[pointer];
        array[pointer] = array[high];
        array[high] = temp;
        return pointer;
    }

}
