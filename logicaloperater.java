public class logicaloperater {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        // Logical AND operator
        System.out.println((a < b) && (b < c)); // true
        System.out.println((a > b) && (b < c)); // false

        // Logical OR operator
        System.out.println((a < b) || (b > c)); // true
        System.out.println((a > b) || (b > c)); // false

        // Logical NOT operator
        System.out.println(!(a < b)); // false
        System.out.println(!(a > b)); // true
    }
}
