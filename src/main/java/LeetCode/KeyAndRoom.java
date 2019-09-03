package LeetCode;

import java.util.*;

/**
 * @Description 钥匙和房间
 * @Author shichao.chen
 * @Date 2019/8/14 16:55
 * @Version 1.0
 **/
public class KeyAndRoom {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms==null||rooms.size()==0)return false;
        Queue<Integer>queue=new LinkedList<>();
        Set<Integer>set =new HashSet<>();
        List<Integer> list=new ArrayList<>();
        queue.offer(0);
        set.add(0);
        while (!queue.isEmpty()){
            int cur=queue.poll();
            list=rooms.get(cur);
            for (int i:list){
                if (!set.contains(i)){
                    queue.offer(i);
                    set.add(i);
                }
            }
        }
        if (set.size()==rooms.size())return true;
        return false;
    }
}
