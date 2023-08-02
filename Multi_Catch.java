public class Multi_Catch {
    public static void main(String[] args) {
        try {
            int a = 10, b = 5, c;
            c = a / b;
            System.out.println(c);

            int arr[] = { 10, 20, 30, 40 };
            System.out.println(arr[3]);

            String str = "saurav";
            int x = Integer.parseInt(str);
            System.out.println(str.toUpperCase());

        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");

        } catch (ArrayIndexOutOfBoundsException d) {
            System.out.println("Enter only length array");

        } catch (NumberFormatException f) {
            System.out.println("Number Exception");
        } catch (Exception z) {
            System.out.println("All type Exception");
        }
    }
}
