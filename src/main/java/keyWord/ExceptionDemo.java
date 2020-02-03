package keyWord;

public class ExceptionDemo {
    public static void main(String[] args) {
        tryTest();
    }

    //子的方法中捕获了异常后，本方法不再处理
    public static void tryTest(){
//        tryte();
        try {
            tryte();
        }catch (Exception e){
//            logger.error("{}",e);
            System.out.println(" 本 ");
            System.out.println(e);
        }
    }

    private static void tryte(){
//        // 使用 throws 抛出到调用的方法处理
//        int a = 1/0;
//        System.out.println(" 子 ");
        try {
            int a = 1/0;
        }catch (Exception e){
//            logger.error("{}",e);
            System.out.println(" 子 ");
            System.out.println(e);
            try {
                int a = 1/0;
            }catch (Exception e1){
                System.out.println(" 子 子 ");
                System.out.println(e);
            }
        }finally {
            System.out.println(" 子 finally ");
        }
    }
}