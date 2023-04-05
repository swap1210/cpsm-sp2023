interface Inter1 {
    void commonTask();
}

class Banana implements Inter1 {
    int calories;

    public Banana(int cal) {
        this.calories = cal;
    }

    public void commonTask() {
        System.out.println("Banana calories is " + calories);
    }
}

class Rock implements Inter1 {
    String name;

    public Rock(String name) {
        this.name = name;
    }

    public void commonTask() {
        System.out.println("Name is " + name);
    }

}

public class Driver {
    public static void main(String[] args) {
        Inter1[] myThings = new Inter1[2];

        myThings[0] = new Banana(67);
        myThings[1] = new Rock("67");

        for (int i = 0; i < myThings.length; i++) {
            myThings[i].commonTask();
        }
    }
}
