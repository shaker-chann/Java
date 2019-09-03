package lan;

import java.math.BigInteger;
import java.util.Scanner;
/*
 * 垒骰子

赌圣atm晚年迷恋上了垒骰子，就是把骰子一个垒在另一个上边，不能歪歪扭扭，要垒成方柱体。
经过长期观察，atm 发现了稳定骰子的奥秘：有些数字的面贴着会互相排斥！
我们先来规范一下骰子：1 的对面是 4，2 的对面是 5，3 的对面是 6。
假设有 m 组互斥现象，每组中的那两个数字的面紧贴在一起，骰子就不能稳定的垒起来。 atm想计算一下有多少种不同的可能的垒骰子方式。
两种垒骰子方式相同，当且仅当这两种方式中对应高度的骰子的对应数字的朝向都相同。
由于方案数可能过多，请输出模 10^9 + 7 的结果。

不要小看了 atm 的骰子数量哦～

「输入格式」
第一行两个整数 n m
n表示骰子数目
接下来 m 行，每行两个整数 a b ，表示 a 和 b 不能紧贴在一起。

「输出格式」
一行一个数，表示答案模 10^9 + 7 的结果。

「样例输入」
2 1
1 2

「样例输出」
544

「数据范围」
对于 30% 的数据：n <= 5
对于 60% 的数据：n <= 100
对于 100% 的数据：0 < n <= 10^9, m <= 36

 */
public class java6B9 {
	public static final int MOD = 1000000007;
	public static int init[] = { -1, 4, 5, 6, 1, 2, 3 }; // 骰子对面 
	public static boolean conflict[][] = new boolean[7][7]; // 冲突
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			conflict[a][b] = conflict[b][a] = true;
			} 
		// dp[i][j] 代表，i个骰子且最顶面是j的情况种数 并且使用了滚动dp，否则会超空间
		BigInteger dp[][] = new BigInteger[2][7]; 
		int e = 0; 
		for (int i = 1; i < 7; i++) dp[e][i] = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			e = 1 - e; 
			for (int j = 1; j < 7; j++) {
				dp[e][j] = BigInteger.ZERO;
				for (int k = 1; k < 7; k++) {
					if (!conflict[init[j]][k])
						dp[e][j] = dp[e][j].add(dp[1 - e][k]).mod( new BigInteger(MOD + ""));
					System.out.println("dp["+e+"]["+j+"]="+dp[e][j]);
					}
				}
			}
		System.out.println("e="+e);
		BigInteger sum = BigInteger.ZERO;
		for (int i = 1; i < 7; i++) {
			sum = sum.add(dp[e][i]).mod(new BigInteger(MOD + ""));
			}
		System.out.println("sum = "+sum);
		System.out.println(sum.multiply(quickpow(4, n)).mod( new BigInteger(MOD + ""))); } 
	// 快速幂 
	static BigInteger quickpow(int n, int m) {
		BigInteger n1 = new BigInteger(n + "");
		BigInteger t = BigInteger.ONE; 
		while (m > 0) {
			if ((m & 1) == 1) t = t.multiply(n1).mod(new BigInteger(MOD + ""));
			n1 = n1.multiply(n1).mod(new BigInteger(MOD + "")); m >>= 1; } return t; }

}
/*
 * 分析
经过仔细的分析，会发现这是一道DP动态规划问题，可以先假设骰子的侧面是固定的，然后通过举例如下：
输入：
2 1
1 2
此时的dp矩阵数组如下：
|      | 1    | 2    | 3    | 4    | 5    | 6    |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| 二层  | 5    | 5    | 6    | 6    | 6    | 6    |
输入：
3 1
1 2
此时的dp矩阵数组如下：
|      | 1    | 2    | 3    | 4    | 5    | 6    | sum  |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| 二层  | 5    | 5    | 6    | 6    | 6    | 6    |34    |
| 三层  | 28   | 28   | 34   | 34   | 34   | 34   |192   |
具体变换过程如下：
|      | 1    | 2    | 3    | 4    | 5    | 6    | sum  |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| 1    | 5    | 5    | 6    | 6    | -    | 6    |28    |
| 2    | 5    | 5    | 6    | -    | 6    | 6    |28    |
| 3    | 5    | 5    | 6    | 6    | 6    | 6    |34    |
| 4    | 5    | 5    | 6    | 6    | 6    | 6    |34    |
| 5    | 5    | 5    | 6    | 6    | 6    | 6    |34    |
| 6    | 5    | 5    | 6    | 6    | 6    | 6    |34    |
从中分析可以发现当n=3时，每种情况都使用到了n=2时的数据，出现重叠子问题与最优子结构，于是用DP来求解。同时，为了节省空间，可以使用滚动DP来替代DP。
最后，由于侧面方案数为4，那么在乘以4^n就可以了就可得到最终解。


 */
