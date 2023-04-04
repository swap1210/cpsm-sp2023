
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Thread1 implements Runnable {
    public void run() {
        System.out.println("Perform Thre1 task here");
    }
}

class Thread2 implements Runnable {
    public void run() {
        System.out.println("Perform Thread2 task here");
    }
}

public class SimpleThread {
    public static void main(String[] args) {
        Runnable t1 = new Thread1();
        Runnable t2 = new Thread2();
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(t1);
        es.execute(t2);
        es.shutdown();
    }
}