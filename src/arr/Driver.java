package arr;

class MyArray {
    int[] arr;

    public MyArray(int size) {
        arr = new int[size];
    }

    void fillArray(int start, int diff) {
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = start;
            start = start + diff;
        }
    }
}

public class Driver {
    public static void main(String[] args) {
        MyArray a = new MyArray(10);
        MyArray b = new MyArray(10);
        MyArray c = new MyArray(10);
        a.fillArray(3, 1);
        b.fillArray(-1, 0);
        b.fillArray(0, 5);
    }
}