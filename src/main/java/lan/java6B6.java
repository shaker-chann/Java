package lan;
/*
 * 加法变乘法

我们都知道：1+2+3+ ... + 49 = 1225
现在要求你把其中两个不相邻的加号变成乘号，使得结果为2015

比如：
1+2+3+...+10*11+12+...+27*28+29+...+49 = 2015
就是符合要求的答案。

请你寻找另外一个可能的答案，并把位置靠前的那个乘号左边的数字提交（对于示例，就是提交10）。
 */

public class java6B6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=1225,temp=0,s=0;
		for(int i=1;i<47;i++) {
			temp=s=sum-i-(i+1)+i*(i+1);
			for(int j=i+2;j<50;j++) {
				s=temp-j-(j+1)+j*(j+1);
				if(s==2015)System.out.println(i);
				}
			}
		}

	

}
