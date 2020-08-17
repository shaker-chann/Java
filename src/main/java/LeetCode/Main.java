package LeetCode;

/**
 * @Description
 * @Author csc
 * @Date 2019/8/13 14:42
 * @Version 1.0
 **/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double[] bags;
        while (cin.hasNext()) {
            int max = (int) (cin.nextDouble() * 100);
            int num = cin.nextInt();
            int cn = 0;
            if (num == 0) break;
            ArrayList<Integer> sum = new ArrayList<Integer>();
            for (int i = 0; i < num; ++i) {
                int count = cin.nextInt();
                boolean flag = true;
                double sumt = 0;
                for (int j = 0; j < count; ++j) {
                    String[] sll = cin.next().split(":");
                    if ((sll[0].equals("A") || sll[0].equals("B") || sll[0].equals("C")) && Double.parseDouble(sll[1]) <= 600) {
                        if (sll[0].equals("A")) sumt += Double.valueOf(sll[1]);
                        if (sll[0].equals("B")) sumt += Double.valueOf(sll[1]);
                        if (sll[0].equals("C")) sumt += Double.valueOf(sll[1]);
                    } else {
                        flag = false;
                    }
                }
                if (flag && sumt <= 1000 && sumt <= max) sum.add((int) (sumt * 100));
            }
            if (sum.isEmpty()) {
                System.out.println("0.00");
                System.out.print(0.00);
            } else {
                bags = new double[max + 1];
                for (int i = sum.get(0); i < max + 1; ++i) {
                    bags[i] = sum.get(0);
                } //动态规划
                for (int i = 1; i < sum.size(); ++i) {
                    for (int j = max; j >= sum.get(i); --j) {
                        bags[j] = Math.max(bags[j], bags[j - sum.get(i)] + sum.get(i));
                    }
                }
                Arrays.sort(bags);
                double result = bags[bags.length - 1] / 100.00; //
                System.out.printf("%.2f\n", result);
                //System.out.println(String.format("%.2f", result));
            }
        }
    }
}