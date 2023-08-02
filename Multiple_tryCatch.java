public class Multiple_tryCatch {

    public static void main(String[] args) {
        try {
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("can't divide by zero");
        }
        try {
            int a[] = { 10, 20, 30, 40, 50 };
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println("beyond the array limit");
        }
    }
}
