package lan;

import java.util.LinkedList;
import java.util.Scanner;
/*
 * 生命之树

在X森林里，上帝创建了生命之树。

他给每棵树的每个节点（叶子也称为一个节点）上，都标了一个整数，代表这个点的和谐值。
上帝要在这棵树内选出一个非空节点集S，使得对于S中的任意两个点a,b，都存在一个点列 {a, v1, v2, ..., vk, b} 使得这个点列中的每个点都是S里面的元素，且序列中相邻两个点间有一条边相连。

在这个前提下，上帝要使得S中的点所对应的整数的和尽量大。
这个最大的和就是上帝给生命之树的评分。

经过atm的努力，他已经知道了上帝给每棵树上每个节点上的整数。但是由于 atm 不擅长计算，他不知道怎样有效的求评分。他需要你为他写一个程序来计算一棵树的分数。

「输入格式」
第一行一个整数 n 表示这棵树有 n 个节点。
第二行 n 个整数，依次表示每个节点的评分。
接下来 n-1 行，每行 2 个整数 u, v，表示存在一条 u 到 v 的边。由于这是一棵树，所以是不存在环的。

「输出格式」
输出一行一个数，表示上帝给这棵树的分数。

「样例输入」
5
1 -2 -3 4 5
4 2
3 1
1 2
2 5

「样例输出」
8
 */
public class java6B10 {
	public static int MAX = 1000010;
    public static int MIN = -1000010;
    public static int dp[][];
    public static int value[];
    public static LinkedList list[];
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        value = new int[n+1];
        for (int i = 1; i <= n; i++) value[i] = sc.nextInt();
        list = new LinkedList[n+1];
        for (int i = 1; i < list.length;i++)list[i] = new LinkedList();
        dp = new int[n+1][2];
        for (int i = 1; i < dp.length;i++)
        {
            dp[i][0] = MIN; dp[i][1] = MIN; 
        }
        for (int i = 1; i < n; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        dfs(1,-1);
        System.out.println(dp[1][0]);
    }
     
    private static void dfs(int p, int fa)
    {
        dp[p][0] = Math.max(dp[p][0], value[p]);
        dp[p][1] = Math.max(dp[p][1], value[p]);
         
        for (int i = 0; i < list[p].size(); i++)
        {
            int son = (int) list[p].get(i);
            if ((son^fa)!=0)
            {
                dfs(son,p);
                dp[p][0] = Math.max(dp[p][0], dp[son][0]);
                if (dp[son][1] > 0) dp[p][1] += dp[son][1];
            }
        }
        dp[p][0] = Math.max(dp[p][0], dp[p][1]);
    }
 
}