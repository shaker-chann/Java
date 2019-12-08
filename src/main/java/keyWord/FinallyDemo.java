package keyWord;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.exit(0);
            int i = 10 / 0;

        }catch (Exception e){
            System.out.println("catch");
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }


    }
}
