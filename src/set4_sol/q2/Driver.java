package set4_sol.q2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {
    public static void main(String[] args) {
        Runnable t1 = new Grass();
        Runnable t2 = new Bamboo();
        
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(t1);
        es.execute(t2);
        es.shutdown();
    }
}
