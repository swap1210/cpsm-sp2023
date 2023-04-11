package set4_sol.q2;

public class Grass implements Runnable{
    int counter;

    public Grass(){
        this.counter = -3;
    }

    @Override
    public void run() {
        counter /= counter+1;
        System.out.println("Counter is "+counter);
    }
}
