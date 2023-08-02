class A {
    void add(int... a) // varargs method
    {
        int sum = 0;
        for (int x : a) {
            sum = sum + x;

        }
        System.out.println("Sum of numbers : " + sum);
    }
}

public class Varargs {
    public static void main(String[] args) {
        A r = new A();
        r.add(1, 2, 3, 4);
    }

}
