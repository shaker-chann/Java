package lan;
/*
 * 立方变自身

观察下面的现象,某个数字的立方，按位累加仍然等于自身。
1^3 = 1 
8^3  = 512    5+1+2=8
17^3 = 4913   4+9+1+3=17
...

请你计算包括1,8,17在内，符合这个性质的正整数一共有多少个？

请填写该数字，不要填写任何多余的内容或说明性的文字。

 */
public class java6B2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,0,0,0,0,0};int count=0,sum2=0;
		for (int i = 1; i < 70; i++) {
			//int sum=i*i*i;
			int sum=(int)Math.pow(i, 3);
			for(int j=0;sum!=0;j++) {
				a[j]=sum%10;
				sum=sum/10;
			}
			for(int m=0;m<a.length;m++) {
				sum2=a[m]+sum2;
			}
			if(sum2==i) {
				count++;
				System.out.println(i);
			}
			sum2=0;
		}
		System.out.println(count);
	}

}
