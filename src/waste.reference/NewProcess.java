class MyCoordinates {
    int x;
    int y;

    public MyCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println("(" + x + "," + y + ")");
    }
}

public class NewProcess {
    public static void main(String[] args) {
        MyCoordinates point1 = new MyCoordinates(2, 4);
        MyCoordinates point2 = new MyCoordinates(3, 4);

        point2.print();
    }
}
