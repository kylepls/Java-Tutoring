package threads;

public class ThreadsDay1 {
    
    public static void main(String[] args) {
    	Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
                System.out.println("Yo");
            }
        };
    
        Thread thread = new Thread(runnable);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Other thread");
            }
        }).start();
        thread.start();
    }
}
