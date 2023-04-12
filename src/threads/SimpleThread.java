
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Shared{
    int counter;

     void taskAtHand(){
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        synchronized(this){
            this.counter+= 3;
        }
    }

}

public class SimpleThread {
    static Shared s = new Shared();
    public static void main(String[] args) throws InterruptedException {


        Runnable t1 = new Thread1(s);
        Runnable t2 = new Thread2(s);
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(t1);
        es.execute(t2);
        es.execute(t2);
        es.execute(t2);
        es.execute(t2);
        es.execute(t1);
        es.shutdown();
        es.awaitTermination(1, TimeUnit.HOURS);
        System.out.println("Final counter "+s.counter);
    }
}


class Thread1 implements Runnable {
    Shared s;

    public Thread1(Shared s) {
        this.s = s;
    }

    public void run() {
        s.taskAtHand();
    }

}

class Thread2 implements Runnable {
    Shared s;

    public Thread2(Shared s) {
        this.s = s;
    }

    public void run() {
        s.taskAtHand();
    }

}
