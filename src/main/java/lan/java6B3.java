package lan;

import java.util.Scanner;

/*
 * 三羊献瑞

观察下面的加法算式：

            祥 瑞 生 辉
+   三 羊 献 瑞
-------------------
       三 羊 生 瑞 气
       其中，相同的汉字代表相同的数字，不同的汉字代表不同的数字。
   题目答案：
1085

aString = String.valueOf(1234);
		aString.charAt(0)=1;
		aString.charAt(1)=2;

 */
	
public class java6B3 {
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
		int sum=1,temp=1,m=2;
		for(int i=1;i<100;i++) {
			temp=temp+m;
			sum=sum+temp;
			m++;
		}
		System.out.println(sum);
		
//		int s = 12345;// char a[],b[],sum[];
//		String aString, bString, sum;
//		for (int i = 9565; i < 10000; i++) {
//			for (int j = 1000; j < 1100; j++) {
//				s = i + j;
//				aString = String.valueOf(i);
//				bString = String.valueOf(j);
//				sum = String.valueOf(s);
//				if (sum.length() == 5) {
//					if (aString.charAt(1) == bString.charAt(3) && aString.charAt(1) == sum.charAt(3)
//							&& aString.charAt(2) == sum.charAt(2) && sum.charAt(0) == bString.charAt(0)
//							&&sum.charAt(1) == bString.charAt(1))  {
//						System.out.println(aString+bString);
//						return ;
//					}
//				}
//			}
//		}
	}

}
