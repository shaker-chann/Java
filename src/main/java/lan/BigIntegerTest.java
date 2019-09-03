package lan;

import java.math.BigInteger;

/*
 * vauleOf(int) 将整型数据转换为大数据 
multiply() 大数据乘法 
add() 大数据加法 
.ZERO/.ONE 大数据0、1的定义
21位数当中一定有许多重复的累加和。到这里也就不难想了，
决定21位数字幂累加的和并不取决于数字的顺序，而是每个数字出现的次数。
设置一个存放每个数字出现次数的数组，对它进行遍历，枚举21位数字的出所有可能。
对每个可能都做计算，判断它是否为一个21位数，这个21位数中每个数字出现的个数是否与我们的数组一致
 */

public class BigIntegerTest {
	static BigInteger[] x=new BigInteger[10];
	
	public static BigInteger pow_21(int n) {
		BigInteger aBigInteger=BigInteger.ONE;
		for(int i=0;i<21;i++) {
			//valueOf(int) 方法对int进行转换为BigInteger大整数
			aBigInteger=aBigInteger.multiply(BigInteger.valueOf(n));
		}
		return aBigInteger;
	}
	
	public static void test(int a[]) {
		BigInteger sum=BigInteger.ZERO;
		for(int i=0;i<10;i++) {
			sum=sum.add(x[i].multiply(BigInteger.valueOf(a[i])));
		}
		String string=sum.toString();
		if(string.length()!=21)return;
		int[] a1=new int[10];
		for(int i=0;i<21;i++) {
			a1[string.charAt(i)-'0']++;
		}
		for(int i=0;i<10;i++) {
			if(a1[i]!=a[i])return;
		}
		System.out.println(string);
	}
	
	//x存放数字的21次方数据 , a存放数字出现次数 , cur当前处理的数字 , use已经使用的位数
	public static void f(int[] a,int cur,int use) {
		
		if(use==21) {
			test(a);
			return;
		}
		if(cur==9) {
			a[9]=21-use;
			test(a);
			return;
		}
		for(int i=0;i<21-use;i++) {
			
			a[cur] = i;//当前数字出现的次数：i
			f(a,cur+1,use+i);
			a[cur] = 0;//回溯
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++)x[i]=pow_21(i);
		int[] a=new int[10];//记录每个数字出现的次数
		f(a, 0, 0);
	}

}
