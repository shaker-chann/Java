package lan;
/*
 *   B      DEF
A + --- + ------- = 10
     C      GHI
     
（如果显示有问题，可以参见【图1.jpg】）
	 
	 
这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。

比如：
6+8/3+952/714 就是一种解法，
5+3/1+972/486 是另一种解法。

这个算式一共有多少种解法？

 */
public class java7B3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(System.currentTimeMillis());
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		paixu(str, 0, str.length - 1);
		System.out.println(count);
		//System.out.println(System.currentTimeMillis());
	}

	public static int count = 0;

	// 交换位置
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// 排序
	public static void paixu(int[] arr, int from, int to) {
		if (to <= 1) {
			return;
		}
		if (from == to) {
			if (check(arr)) {
				count++;
			}
		} else {
			for (int i = from; i <= to; i++) {
				swap(arr, i, from);
				paixu(arr, from + 1, to);
				swap(arr, from, i);
			}
		}
	}

	public static boolean check(int[] arr) {
		int shang = arr[3] * 100 + arr[4] * 10 + arr[5];
		int xia = arr[6] * 100 + arr[7] * 10 + arr[8];
		if (arr[0] + arr[1] * 1.0 / arr[2] + shang * 1.0 / xia == 10) {
			return true;
		} else {
			return false;
		}
	}

}
