package error.oom;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @PackageName: com.csc.demo1.other
 * @Author: csc
 * @Create: 2020-09-30 13:35
 * @Version: 1.0
 */
public class MemoryShake {
    static class OOMClass {
        private int[] oom = new int[1024 * 100];// 100KB
    }

    //声明缓存对象
    private static final Map map = new HashMap();

    public static void main(String args[]) {
//        ArrayList<String > list = new ArrayList<>();
//        SoftReference<ArrayList> softRef = new SoftReference<ArrayList>(list);
        ReferenceQueue<OOMClass> queue = new ReferenceQueue<>();
        List<WeakReference> list = new ArrayList<>();

        try {
            Thread.sleep(10000);//给打开visualvm时间
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //循环添加对象到缓存
        for (int i = 0; i < 4000000; i++) {
            TestMemory t = new TestMemory();
            map.put("key" + i, t);
            list.add(new WeakReference<OOMClass>(new OOMClass(), queue));
        }
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("qqqq");
    }

}

class TestMemory {
    public String name = "huangzs";
    public String address = "huangzs_jiujiangshi_jiangxisheng";
}
