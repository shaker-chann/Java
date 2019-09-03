package lan;

import java.util.ArrayList;
import java.util.List;

/*
 * answer 116
 * 
 * 先排列，从12个邮票中选5个出来，
         然后对每个邮票搜索，同一行，同一列，则表示连接到，如果连接到就定义
        该块邮票被访问过，最后判断5个邮票是否都被访问过，是就说明是连通的，
        但是这个不是全排列，应该是从12个选5个出来
        从12个选5个。判断5个是否相连，符合一个visit设为true，五个true，count++
 */
public class java7B7 {
	static int sum=0;
	static int a[] = new int[5];  

	static boolean test(int[] b) {
		return true;
	}
	
	private static void f(int[] a,int cur,int use) {//,String s
		if(use==5) {
			List<Integer> tempList = new ArrayList<Integer>();
	        for(int i=0;i<a.length-1;i++){
	            if(tempList.contains(a[i])){//判断是否有重复数据，如果没有就将数据装进临时集合
	                return;
	            }else if(a[i]>a[i+1]){
	            	return;
	            }else {
	            	tempList.add(a[i]);
	            }
	        }
	        if(tempList.contains(a[4]))return;
			if (judge()) {
			sum++;
//			for(int i:a)
//        		System.out.print(i+" ");
//        	System.out.println();
			return;
			}else {
				return;
			}
//	        sum++;
//	        return;
		}
		if(cur>12)return;
		for(int i=cur;i<12;i++){
			a[use]=i;
			f(a, cur+1, use+1);
			a[use]=-1;
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		f(a, 0, 0);
		System.out.println(sum);
        for (a[0] = 0; a[0] < 12; a[0]++) {  
            for (a[1] = a[0] + 1; a[1] < 12; a[1]++) {  
                for (a[2] = a[1] +1 ; a[2] < 12; a[2]++) {  
                    for (a[3] = a[2]+1; a[3] < 12; a[3]++) {  
                        for (a[4] = a[3]+1; a[4] < 12; a[4]++) {  
                            if (judge()) {
                                count++; 
//                                for(int i:a)
//                            		System.out.print(i+" ");
//                            	System.out.println();
                            }  
                        }  
                    }  
                }  
            }  
        }  
        System.out.println(count);  
    }  
    private static boolean judge() {  
        boolean visit[] = new boolean[5];  
        dfs(visit,0);  
        return visit[0]&&visit[1]&&visit[2]&&visit[3]&&visit[4];  
    }  
  
    private static void dfs(boolean[] visit, int i) {  
        visit[i] = true;  
        for (int j = 0; j < visit.length; j++) {  
            if (!visit[j]&&(a[i]/4==a[j]/4)&&(a[i]==a[j]+1||a[i]==a[j]-1)) {  
                dfs(visit, j);  
            }  
            if (!visit[j]&&(a[i]==a[j]+4||a[i]==a[j]-4)) {  
                dfs(visit, j);  
            }  
        }  
    }  
}

