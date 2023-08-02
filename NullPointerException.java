public class NullPointerException {
    public static void main(String[] args) {
        String str = "saurav";

        try {
            // String str = null;
            // System.out.println(str.toUpperCase());

            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("NumberFormatException");
        }
    }

}
