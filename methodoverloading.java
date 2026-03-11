public class methodoverloading {

    static int findSum(int a, int b) {
        return a + b;
    }

    static int findSum(int x, int y, int z) {
        return x + y + z;
    }

    static double findSum(double c, double d) {
        return c + d;
    }

    public static void main(String[] args) {
        int sum1 = findSum(10, 20); // Calls method with 2 integers
        int sum2 = findSum(2, 4, 6); // Calls method with 3 integers
        double sum3 = findSum(5.5, 3.2); // Calls method with doubles

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}