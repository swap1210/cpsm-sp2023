
class Thread3 extends Thread{
    public void run(){
        System.out.println("Do this");
    }
}


public class SimplestThread {
    public static void main(String[] args) throws InterruptedException {
        
        Thread3 t3 = new Thread3();
        Thread3 t4 = new Thread3();
        Thread3 t5 = new Thread3();
        Thread3 t6 = new Thread3();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t4.join();
        t5.join();
        t6.join();
    }
}
