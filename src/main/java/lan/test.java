package lan;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Vector;

public class test {
	public static int f(String s)
	{
		return s.split("\\D").length;
	}
	static int[] a = new int[] { 0, 7, 4, 0, 0, 0, 0, 4, 0, 7, 0, 0, 0, 0, 0 };

	public static void getResult(int index) {
        if (index == 4) {//跳过数字4
            index++;
        }
        if (index >= 7) {//此时说明1-7数字都被取完,输出答案即可
            for (int i = 1; i < a.length; i++) {
                System.out.print(a[i]);
            }
        }
        //i--->位数
        for (int i = 3; i < 14; i++) {
            if ((i + index + 1) <= 14 && a[i] == 0 && a[i + index + 1] == 0) {
                a[i] = a[i + index + 1] = index;
                getResult(index + 1);
                //------------------------------
                //执行到这一步说明此时的数字index不适合于位置i,撤回赋值
                a[i] = a[i + index + 1] = 0;
            }
        }
    }

	static void swap(int in[],int a,int b) {
		int temp=in[a];
		in[a]=in[b];
		in[b]=temp;
	}
	static void duck(int in[],int size,int depth) {
		if(depth==size-1) {
			for(int n:in)System.out.print(n);
		System.out.println();}
		else if(depth<size-1) {
			for(int i=depth;i<size;i++) {
				swap(in,depth,i);
				duck(in, size, depth+1);
				swap(in,i,depth);
			}
		}

	}

	public static void main(String[] args) {
		 int input[] = {1,3,5,7};
		// for(int n:input)System.out.println(n);
		  //  printf("1,3,5,7全排列：\n");
		 //   duck(input,4,0);
		  //System.out.println(test.Function(0,4));
//		    Integer i = new Integer(100);
//		    Integer j = 100;如果可以的话我想用来当课设，我们那个Java张世勇和他对象拿走用了
//		    System.out.print(i == j); //false
		 Integer i = new Integer(100);
		 int j = 100;
		 System.out.print(i == j); //true
		// TODO Auto-generated method stub
//		System.out.println(f("12+35*5-2*18/9-3")); //7
//		System.out.println(f("354*12+3-14/7*6")); //6
//		double s=0,i=1;
//		while(s<=5) {
//			s=s+1/i;
//			i++;
//		}
//		System.out.println(i);
//		double l=2,r=3;
//		double t=2.5,l1,r1;
//		for(int i=0;i<6;i++) {
//			l1=(l+t)/2;
//			r1=(r+t)/2;
//			if(Math.abs(Math.pow(l1, l1)-10)>Math.abs(Math.pow(r1, r1)-10)) { 
//				l=t;
//				t=r1;
//			}else {
//				r=t;
//				t=l1;
//			}
//		}
//		System.out.println(String.format("%.6f", t));
		
//		Scanner scanner=new Scanner(System.in);
//		int count = 0;
//		int c = scanner.nextInt();
//		for (int i = 1; i < c; i++) {
//			double j = Math.sqrt(c * c - i * i);
//			int t = (int) j;
//			if (i + t > c) {
//				if (t * t == c * c - i * i) {
//					count++;
//				}
//			}
//		}
//		System.out.println(count / 2);
		
		//int[] a = new int[] { 0, 7, 4, 0, 0, 0, 0, 4, 0, 7, 0, 0, 0, 0, 0 };
		
		
//		System.out.println(a.length);
//		getResult(1);//从数字1开始





	}

}
