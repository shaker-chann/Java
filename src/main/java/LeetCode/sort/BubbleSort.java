package LeetCode.sort;

/**
 * @Description:
 * @Author: csc
 * @Create: 2024-01-16
 */
public class BubbleSort {
    static int count = 0;
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        bubbleSort1(ints);
        System.out.println(count);
    }

    public static int[] bubbleSort1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
//                count++;

            }
        }
        return arr;
    }

    public static int[] bubbleSort2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // Set a flag, if true, that means the loop has not been swapped,
            // that is, the sequence has been ordered, the sorting has been completed.
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    // Change flag
                    flag = false;
                }

            }


            //第一个优化
            if (flag) {
                break;
            }
        }
        return arr;
    }



    public static int[] bubbleSort3(int[] arr) {
        int lastIndex = arr.length - 1;
        for (int i = 1; i < arr.length; i++) {
            // Set a flag, if true, that means the loop has not been swapped,
            // that is, the sequence has been ordered, the sorting has been completed.
            boolean flag = true;
            for (int j = 0; j < lastIndex; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    // Change flag
                    flag = false;

                    //第二个优化：每次冒泡后最后几个元素已经是有序的
                    lastIndex = j;
                }
            }


            //第一个优化
            if (flag) {
                break;
            }
        }
        return arr;
    }

}
