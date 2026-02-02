public class multidimensionalarray {
    public static void main(String[] args) {
        // according to mult.dim.arrays we can describe two or more arrays in one
        // variable
        int[][] num = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 } };
        // first [] says which number of array and second [] says the index number of
        // elements
        System.out.println(num[1][1]);
        System.out.println(num[0][2] + num[1][2]);
    }
}
