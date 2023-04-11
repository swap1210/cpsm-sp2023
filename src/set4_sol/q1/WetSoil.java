package set4_sol.q1;

public class WetSoil extends Soil implements Dirt{

    public void action() {
        System.out.println("Wet soils density is "+this.density);
    }

    public static void main(String[] args) {
        Dirt[] d = new Dirt[5];

        d[0] = new WetSoil();
        d[1] = new WetSoil();
        d[2] = new Bulb();
        d[3] = new Bulb();
        d[4] = new Bulb();

        WetSoil w = new WetSoil();

        System.out.println(w.density);

        for(Dirt d_temp: d){
            d_temp.action();
        }
    }
}
