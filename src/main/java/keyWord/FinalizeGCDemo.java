package keyWord;

/**
 * @Description:
 * @PackageName: keyWord
 * @Author: csc
 * @Create: 2022-10-14 17:07
 * @Version: 1.0
 */
public class FinalizeGCDemo {
    public static FinalizeGCDemo obj;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Resurrection finalize called !!!");
        obj = this;//在finalize方法中复活对象
    }

    @Override
    public String toString() {
        return "I am Resurrection";
    }

    public static void main(String[] args) throws InterruptedException {
        obj = new FinalizeGCDemo();
        obj = null; //将obj设为null
        System.gc();//垃圾回收

        Thread.sleep(1000);//
        /**
         * 可达性分析：obj不可达进行第一次标记，筛选：有必要执行finalize方法（方法中将obj与this关联）；
         *          需要执行的对象将会被放在一个队列中进行第二次标记,obj与引用链上的任何一个对象this建立关联，不会被回收
         */
        if(obj == null) {
            System.out.println("obj is null");
        } else {
            System.out.println("obj is alive");
        }

        System.out.println("第2次调用gc后");
        obj = null;//由于obj被复活，此处再次将obj设为null
        System.gc();//再次gc
        Thread.sleep(1000);
        if(obj == null) {
            /**
             * 对象的finalize方法仅仅会被调用一次，所以可以预见再次设置obj为null后，obj会被垃圾回收，该语句会被调用
             * 可达性分析：obj不可达进行第一次标记，筛选：没有必要执行finalize方法，
             */
            System.out.println("obj is null");
        } else {
            System.out.println("obj is alive");
        }
    }
}
