
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//question with thread filling array
class MyArray {
    int[] arr;
    int index;

    public MyArray(int size) {
        index = 0;
        this.arr = new int[size];
    }

    // public synchronized void add(int val) {
    public synchronized void add(int val) {
        if (index == arr.length) {
            return;
        }
        this.arr[index] = val;
        index++;
        System.out.println("Setting " + index + " to " + val);
    }

}

public class Driver1 {
    public static void main(String[] arg) {
        MyArray arrObj = new MyArray(10);
        Thread1 t1 = new Thread1(arrObj, 10, 10);
        Thread1 t2 = new Thread1(arrObj, 100, 10);

        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(t1);
        es.execute(t2);
        es.shutdown();

        // System.out.println(Arrays.toString(arrObj.arr));
    }
}

class Thread1 implements Runnable {
    MyArray localArray;
    int start;
    int increment;

    public Thread1(MyArray obj, int start, int increment) {
        this.localArray = obj;
        this.start = start;
        this.increment = increment;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            // System.out.println(i + " Incremented by " + start);
            localArray.add(start);
            start = start + increment;
        }
    }

}