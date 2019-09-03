package lan;

import java.util.Scanner;

public class java7B9 {
	public static int [] n = new int[3];  
    public static int [] init = new int[5];  
    public static int [] end = new int[1000];  
    public static char [] sign = {'-','0','0','+'};  

    public static int[] a;
    public static int min;
    public static int[][][] cash = new int[1001][2][2];

    public static int f(int rest, int havenum, int othernum) {
        if (rest < min) {
            if (havenum % 2 != 0 && othernum % 2 == 0)
                return 2;
            if (havenum % 2 != 0 && othernum % 2 != 0)
                return 1;
            if (havenum % 2 == 0 && othernum % 2 == 0)
                return 1;
            return -1;
        }
        boolean equalflag = false;
        for (int sel : a) {
            if (sel > rest)
                continue;
            int result;
            if (cash[rest - sel][othernum % 2][(havenum + sel) % 2] != 0)
                result = cash[rest - sel][othernum % 2][(havenum + sel) % 2];
            else {
                result = f(rest - sel, othernum, havenum + sel);
                cash[rest - sel][othernum % 2][(havenum + sel) % 2] = result;
            }
            if (result == -1)
                return 2;
            if (result == 1)
                equalflag = true;
        }
        if (equalflag)
            return 1;
        else
            return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = { 10, 11,12, 13, 15};
        a = new int[] { 1, 4, 5 };
        min = 1;
        for (int total : b) {
            char ch = 0;
            switch (f(total, 0, 0)) {
            case -1:
                ch = '-';
                break;
            case 1:
                ch = '0';
                break;
            case 2:
                ch = '+';
                break;
            }
            System.out.print(ch);
        }
//
//		Scanner scan = new Scanner(System.in);  
//        for(int i = 0; i < 3; i++){  
//            n[i] = scan.nextInt();  
//        }  
//        int Min = Math.min(n[0], Math.min(n[1], n[2]));  
//        for(int i = 0; i < 5; i++){  
//            init[i] = scan.nextInt();  
//        }  
//        for(int i = 0; i < Min; i++){  
//            end[i] = 2;  
//        }  
//        for(int i = Min; i < end.length; i++){  
//            int temp = 0;  
//            for(int j =0; j < 3; j++){  
//                if(i - n[j] < 0)  
//                    continue;  
//                else if(end[i-n[j]] == 3){  
//                    if(n[j]%2 != 0)  
//                        temp = 1 > temp ? 1 : temp;  
//                }  
//                else if(end[i-n[j]] == 0){  
//                    if(n[j]%2 == 0)  
//                        temp = 3;  
//                    else  
//                        temp = 2 > temp ? 2 : temp;  
//                }  
//                else if(end[i-n[j]] == 2){  
//                    if(n[j]%2==0)  
//                        temp = 2 > temp ? 2 : temp;  
//                    else  
//                        temp = 3;  
//                }  
//                else if(end[i-n[j]] == 1){  
//                    if(n[j]%2==0)  
//                        temp = 1 > temp ? 1 : temp;  
//                }  
//            }  
//            end[i] = temp;  
//        }  
//        for(int i = 0; i < 5; i++){  
//            System.out.print(sign[end[init[i]]]+" ");  
//        }  

	}

}
