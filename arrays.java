public class arrays {
    public static void main(String[] args) {
        String fruit = "Banana";
        System.out.println(fruit);
        String[] fruits = { "Banana", "apple", "orange", "melon" };
        System.out.println(fruits[0]);
        // we can give the index no. of item we need to access
        System.out.println(fruits.length);
        // here we get length as 4because the items present in the array is 4

        for (int i = 0; i < fruits.length; ++i) {
            System.out.println(fruits[i]);
            //here one by one the items will get printed
        }

        fruits[0] = "orange";
        System.out.println(fruits[0]);
        // here we will get orange as output bcz index 0 is replaced as orange

        int[] numbers = { 10, 20, 30, 40 };
        System.out.println(numbers[1] + numbers[3]);

    }
}
