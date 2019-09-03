package lan;
/*
 * 方格填数

如下的10个格子
   +--+--+--+
   |  |  |  |
+--+--+--+--+
|  |  |  |  |
+--+--+--+--+
|  |  |  |
+--+--+--+

（如果显示有问题，也可以参看【图1.jpg】）

填入0~9的数字。要求：连续的两个数字不能相邻。
（左右、上下、对角都算相邻）
 */
public class java7B6 {
	static int sum = 0 ;

	private static void f(int[] a,int[] b,int k) {//,String s
        if(k!=0 && k!=1 && k!=4 && k!=8 ){//左右
            if(Math.abs(b[k-1]-b[k-2])==1) return;
        }
        if(k>=4 && k<=10 && k!=7){//右上、
            if(Math.abs(b[k-1]-b[k-4])==1) return;
        }
        if(k>=5 && k<=10){//上下
            if(Math.abs(b[k-1]-b[k-5])==1) return;
        }
        if(k==6 || k==7 || k==9 || k==10){//左上
            if(Math.abs(b[k-1]-b[k-6])==1) return;
        }
        
        if(k==a.length) {
            sum++;
            //System.out.println(s);
            return;
        }
        for(int i=0;i<a.length;i++){
            //String ss = s;
            if(a[i]==-1) continue;
            b[k] = a[i];
            //ss += a[i];,ss
            a[i] = -1;
            f(a,b,k+1);
            a[i] = b[k];
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,1,2,3,4,5,6,7,8,9};
        int b[] = new int[10];
        //String s = "";,s
        f(a,b,0);
        System.out.println(sum);
	}
}
