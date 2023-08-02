public class Exception_handling {
    public static void main(String[] args) {
        System.out.println("main method started");
        int a = 10, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Can't divide by zero");
        }
        System.out.println("main method Ended");

    }
}
