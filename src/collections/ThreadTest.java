package src.collections;

public class ThreadTest {
    public static void main(String[] args) {

        new Thread(()->{
            for (int i=0;i<2;i++)
            {
                System.out.print("2");
            }
        }).start();

        new Thread(()->{
            for (int i=0;i<2;i++)
            {
                System.out.print("1");
            }
        }).start();
    }
}
