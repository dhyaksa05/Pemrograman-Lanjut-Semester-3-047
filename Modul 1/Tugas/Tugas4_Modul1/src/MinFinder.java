public class MinFinder {

    public static int findMin(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println("Skenario 1: findMin(8, 9, 6 ) = " + findMin(8, 9, 6));

        System.out.println("Skenario 2: findMin(-1, 10, -3) = " + findMin(-1, 10, -3));

        System.out.println("Skenario 3: findMin(5, 0, 10) = " + findMin(5, 0, 10));
    }
}