package set4_sol.q2;

public class Bamboo implements Runnable {
    int counter;

    @Override
    public void run() {
        counter = 15;
        System.out.println("Counter is "+counter);
    }

}
