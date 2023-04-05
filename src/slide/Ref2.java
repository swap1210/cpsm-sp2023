
class Corner {
    int x;
    int y;

    public Corner(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

class Square {
    int side;
    Corner corner;
    boolean isFilled;

    public Square(int side, Corner con, boolean isFilled) {
        this.side = side;
        this.corner = con;
        this.isFilled = isFilled;
    }

}

public class Ref2 {
    public static void main(String[] args) {
        Square a, b, c;
        Corner commonCorner = new Corner(3, 4);

        a = new Square(0, commonCorner, true);
        b = a;
        c = new Square(5, commonCorner, true);
    }
}
