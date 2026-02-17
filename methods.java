public class methods {
    static void printMessage() {
        // static denotes that the method created includes in main class.
        // it is not an object in the main class
        // printMessage is the methods name
        System.out.println("hello world");

    }

    public static void main(String[] args) {
        // to call the method we need to do
        printMessage();
        printMessage();
        printMessage();
    }
}
