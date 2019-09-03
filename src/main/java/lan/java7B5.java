package lan;
/*
 * 抽签

X星球要派出一个5人组成的观察团前往W星。
其中：
A国最多可以派出4人。
B国最多可以派出2人。
C国最多可以派出2人。
....

那么最终派往W星的观察团会有多少种国别的不同组合呢？
 */
public class java7B5 {
	public static void f(int[] a, int k, int n, String s)
	{
		if(k==a.length){ 
			if(n==0) System.out.println(s);
			return;
		}
		
		String s2 = s;
		for(int i=0; i<=a[k]; i++){
			f(a,k+1,n-i,s2);
			s2 += (char)(k+'A');
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,2,2,1,1,3};
		f(a,0,5,"");
	}

}
