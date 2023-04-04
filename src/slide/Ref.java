
class S {
    String text;

    public S(String text) {
        this.text = text;
    }
}

public class Ref {
    public static void main(String[] args) {
        S s1;

        s1 = new S("first");
        S s2 = s1;
    }
}
