package lan;

/*
 * 压缩变换

小明最近在研究压缩算法。
他知道，压缩的时候如果能够使得数值很小，就能通过熵编码得到较高的压缩比。
然而，要使数值很小是一个挑战。

最近，小明需要压缩一些正整数的序列，这些序列的特点是，后面出现的数字很大可能是刚出现过不久的数字。
对于这种特殊的序列，小明准备对序列做一个变换来减小数字的值。

变换的过程如下：
从左到右枚举序列，每枚举到一个数字，如果这个数字没有出现过，刚将数字变换成它的相反数，如果数字出现过，
则看它在原序列中最后的一次出现后面（且在当前数前面）出现了几种数字，用这个种类数替换原来的数字。

比如，序列(a1, a2, a3, a4, a5)=(1, 2, 2, 1, 2)在变换过程为：
a1: 1未出现过，所以a1变为-1；
a2: 2未出现过，所以a2变为-2；
a3: 2出现过，最后一次为原序列的a2，在a2后、a3前有0种数字，所以a3变为0；
a4: 1出现过，最后一次为原序列的a1，在a1后、a4前有1种数字，所以a4变为1；
a5: 2出现过，最后一次为原序列的a3，在a3后、a5前有1种数字，所以a5变为1。
现在，给出原序列，请问，按这种变换规则变换后的序列是什么。

输入格式：
输入第一行包含一个整数n，表示序列的长度。
第二行包含n个正整数，表示输入序列。

输出格式：
输出一行，包含n个数，表示变换后的序列。

例如，输入：
5
1 2 2 1 2

程序应该输出：
-1 -2 0 1 1

再例如，输入：
12
1 1 2 3 2 3 1 2 2 2 3 1

程序应该输出：
-1 0 -2 -3 1 1 2 2 0 0 2 2
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class java7B10 {
	public static int[] start;
    public static int[] end;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        start = new int[n];
        end = new int[n];
        Map map = new HashMap(); 
        //输入
        for (int i = 0; i < n; i++) {
            start[i] = scanner.nextInt();
            map.put(i, start[i]);
        }
        //进行计算
        for (int i = 0; i < n; i++) {
            end[i] = jisuan(i);
        }
        //输出结果
        for (int jieguo : end) {
            System.out.print(jieguo+" ");
        }
    }
    private static int jisuan(int n) {
        //set集合无序，不能重复
        Set<Integer> set = new HashSet<>();
//先将前面一个数字和当前数字进行比较，然后逐渐向前-1，进行比较
//1.如果挨着的都相等，直接返回当前set集合的size即是0
//2.如果挨着的不相等，在继续--往前面找，不相同就加set集合，因为只能存放不相同的元素，所以集合里存放着的就是前面有几个类型的数字；
//3.如果是第一个数字，或者前面没有任何一个数字跟我相同，即第一次出现，返回当前数字的相反数
        for (int i = n-1; i >=0 ; i--) {
            if (start[i] == start[n]) {
                return set.size();
            }
            set.add(start[i]);
//            System.out.println("set size"+set.size());
            Iterator<Integer> iterator = set.iterator();
//            while(iterator.hasNext()) {
//                System.out.println("set "+iterator.next());
//            }
        }
        return -start[n];
    }
}
