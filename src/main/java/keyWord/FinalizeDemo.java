package keyWord;

public class FinalizeDemo {
    public int id;

    public FinalizeDemo(int id) {
        this.id = id;
    }

    @Override
    protected void finalize() {
        switch (id) {
            case 1:
                System.out.println("--1");
                break;
            case 2:
                System.out.println("--2");
                break;
            default:
                System.out.println("--other");
                break;

        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        FinalizeDemo finalDemo = new FinalizeDemo(1);
        new FinalizeDemo(2);
        new FinalizeDemo(3);
        System.gc();
    }

}
