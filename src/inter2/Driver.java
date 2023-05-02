package inter2;

interface Shape {
    double area();
}

class Circle implements Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}

class Square implements Shape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }
}

public class Driver {
    public static void main(String[] args) {
        Shape[] s = new Shape[50];

        for (int i = 0; i < 25; i++) {
            s[i] = new Circle(3 * (i + 1));
            s[i + 25] = new Square(5 * (i + 1));
            s[i].area();
            s[i + 25].area();
        }
    }
}
