package multithreading;

public class MultiThreading {
    public static void main (String[] args) {

        Thread t1 = new Thread(() -> {
            for ( int i = 1; i <= 10; i++ ) {
                try {
                    System.out.println(i);
                    Thread.sleep(1000);
                } catch ( InterruptedException e ) {
                    e.printStackTrace();
                }

            }
        });
        t1.start();
    }
}