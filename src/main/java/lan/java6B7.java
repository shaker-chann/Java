package lan;
/*
 * 牌型种数

小明被劫持到X赌城，被迫与其他3人玩牌。
一副扑克牌（去掉大小王牌，共52张），均匀发给4个人，每个人13张。
这时，小明脑子里突然冒出一个问题：
如果不考虑花色，只考虑点数，也不考虑自己得到的牌的先后顺序，自己手里能拿到的初始牌型组合一共有多少种呢？
 */
public class java6B7 {
	static int sum = 0; // 记录结果 
	static int use=0;// 记录手中的牌的数目
	public static void f(int cur) {
		if (use > 13)
			return;
		if (cur == 14) {
			if (use == 13) {
				sum++;
				return;
			}
		} else {
			for (int i = 0; i < 5; i++) {
				use += i;
				f(cur + 1);
				use -= i;// 回溯
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(1);
		System.out.println(sum);
	}

}
