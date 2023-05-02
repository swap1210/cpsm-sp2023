package sort_check;

public class Driver {
    public static void main(String[] args) {
        int[] a = { 5, 13, 23, 31, 45 };

        System.out.println("Is sorted in ascending order: " + isSortedAsc(a));
        System.out.println("Is sorted in descending order: " + isSortedDesc(a));
    }

    private static boolean isSortedDesc(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] > a[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSortedAsc(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] < a[i]) {
                return false;
            }
        }
        return true;
    }
}
